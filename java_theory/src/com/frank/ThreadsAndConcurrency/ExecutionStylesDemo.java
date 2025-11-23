package com.frank.ThreadsAndConcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.LongStream;

public class ExecutionStylesDemo {

	private static final int TASK_COUNT = 3;
	private static final int IO_WAIT_MS = 1000; // Simulated I/O wait time
	private static final long MAX_RANGE = 100_000_000L; // CPU-bound work size

	/**
	 * Simulates an I/O-bound task (e.g., API call, DB query)
	 * 
	 * @param taskId Identifier for the task
	 * @return The task ID after the delay
	 */
	private static int ioTask(int taskId) {
		System.out.printf("   [Task %d] Starting I/O wait...%n", taskId);
		try {
			// Simulate blocking I/O operation
			Thread.sleep(IO_WAIT_MS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.printf("   [Task %d] I/O completed.%n", taskId);
		return taskId;
	}

	/**
	 * Simulates a heavy CPU-bound task (e.g., complex calculation)
	 */
	private static long cpuTask() {
		// Heavy reduction on a large array (CPU-bound)
		return LongStream.range(0, MAX_RANGE).parallel().sum();
	}

	// --- 1. SEQUENTIAL EXECUTION ---
	private static void runSequential() {
		long start = System.currentTimeMillis();
		System.out.println("--- 1. SEQUENTIAL (One after the other) ---");

		for (int i = 1; i <= TASK_COUNT; i++) {
			ioTask(i); // Each task waits for the previous one to complete its I/O
		}

		System.out.println("   Starting final CPU-bound task...");
		cpuTask(); // CPU task starts after all I/O tasks are fully done

		long end = System.currentTimeMillis();
		System.out.printf("   TOTAL TIME (Sequential): %d ms%n%n", (end - start));
	}

	// --- 2. CONCURRENT EXECUTION ---
	private static void runConcurrent() throws InterruptedException, ExecutionException {
		long start = System.currentTimeMillis();
		System.out.println("--- 2. CONCURRENT (Juggling I/O tasks on shared resources) ---");

		// Use a fixed pool to manage concurrent threads
		// The benefit is seen when threads context switch during I/O waits
		ExecutorService executor = Executors.newFixedThreadPool(TASK_COUNT);
		List<Future<Integer>> results = new java.util.ArrayList<>();

		// Start all I/O tasks immediately
		for (int i = 1; i <= TASK_COUNT; i++) {
			final int taskId = i;
			// The executor starts the tasks and the main thread waits for the longest one
			results.add(executor.submit(() -> ioTask(taskId)));
		}

		// Wait for all results (This wait is dominated by the longest I/O time, not the
		// sum of I/O times)
		for (Future<Integer> result : results) {
			result.get();
		}
		executor.shutdown();

		System.out.println("   Starting final CPU-bound task...");
		cpuTask(); // CPU task starts after all I/O is done

		long end = System.currentTimeMillis();
		System.out.printf("   TOTAL TIME (Concurrent): %d ms (Close to 1x I/O time + CPU time)%n%n", (end - start));
	}

	// --- 3. PARALLEL EXECUTION ---
	private static void runParallel() {
		long start = System.currentTimeMillis();
		System.out.println("--- 3. PARALLEL (CPU-bound work across multiple cores) ---");

		// Functional Programming & Parallel Streams: The easiest way to achieve
		// parallelism
		System.out.println("   Starting heavy CPU task using Parallel Stream...");
		long parallelSum = LongStream.range(0, 5 * MAX_RANGE) // Make the workload 5x bigger
				.parallel() // Split work across all available cores
				.sum();

		System.out.printf("   Parallel Sum Result: %d%n", parallelSum);

		long end = System.currentTimeMillis();
		System.out.printf("   TOTAL TIME (Parallel CPU Work): %d ms%n", (end - start));
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		runSequential();
		runConcurrent();
		runParallel();
	}
}