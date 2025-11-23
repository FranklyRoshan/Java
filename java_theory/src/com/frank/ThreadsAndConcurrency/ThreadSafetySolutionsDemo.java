package com.frank.ThreadsAndConcurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadSafetySolutionsDemo {

	private static final int NUM_TASKS = 100000;
	private static final int INCREMENTS_PER_TASK = 10;
	private static final int EXPECTED_COUNT = NUM_TASKS * INCREMENTS_PER_TASK; // 1,000,000

	// --- 1. UNSAFE Counter (Race Condition Example) ---
	static class UnsafeCounter {
		private int count = 0;

		// count++ is NOT atomic (Read -> Modify -> Write)
		public void increment() {
			count++;
		}

		public int getCount() {
			return count;
		}
	}

	// --- 2. SAFE Counter using synchronized ---
	static class SynchronizedCounter {
		private int count = 0;

		// synchronized locks the entire method (locking the object's intrinsic monitor)
		// Only one thread can enter this method at a time, ensuring atomicity.
		public synchronized void increment() {
			count++;
		}

		public int getCount() {
			return count;
		}
	}

	// --- 3. SAFE Counter using AtomicInteger ---
	static class AtomicCounter {
		// AtomicInteger provides atomic operations without explicit locking
		private AtomicInteger count = new AtomicInteger(0);

		public void increment() {
			// incrementAndGet() is an atomic (all-or-nothing) operation at the hardware/CPU
			// level
			count.incrementAndGet();
		}

		public int getCount() {
			return count.get();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("--- Race Condition & Thread Safety Solutions Demo ---");
		System.out.println("Expected Final Count (if thread-safe): " + EXPECTED_COUNT);
		System.out.println("-----------------------------------------------------");

		// Use Virtual Threads for highly concurrent testing
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

		// Helper method to run the concurrent test
		Runnable runTest = (counter) -> {
			IntStream.range(0, NUM_TASKS).forEach(i -> executor.submit(() -> {
				// Each task increments 10 times
				IntStream.range(0, INCREMENTS_PER_TASK).forEach(j -> counter.increment());
			}));
			executor.shutdown();
			// Wait for all tasks to finish
			try {
				executor.awaitTermination(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		};

		// ======================================================================
		// 1. DEMO: RACE CONDITION (UNSAFE)
		// ======================================================================
		UnsafeCounter unsafe = new UnsafeCounter();
		System.out.println("1. Unsafe Counter (Race Condition Expected):");
		runTest.accept(unsafe); // Running test with unsafe counter
		System.out.println("   Actual Final Count (Unsafe): " + unsafe.getCount());
		System.out.println("   Result: LOST UPDATES occurred.");

		// Reset and reuse executor for the next test
		executor = Executors.newVirtualThreadPerTaskExecutor();

		// ======================================================================
		// 2. SOLUTION: synchronized keyword
		// ======================================================================
		SynchronizedCounter syncCounter = new SynchronizedCounter();
		System.out.println("\n2. Synchronized Solution (Thread-Safe):");
		runTest.accept(syncCounter);
		System.out.println("   Actual Final Count (Synchronized): " + syncCounter.getCount());

		// Reset and reuse executor for the next test
		executor = Executors.newVirtualThreadPerTaskExecutor();

		// ======================================================================
		// 3. SOLUTION: Atomic Variable Classes (Recommended for counters)
		// ======================================================================
		AtomicCounter atomicCounter = new AtomicCounter();
		System.out.println("\n3. AtomicInteger Solution (High Performance Thread-Safe):");
		runTest.accept(atomicCounter);
		System.out.println("   Actual Final Count (Atomic): " + atomicCounter.getCount());

		// ======================================================================
		// 4. SOLUTION: Concurrent Collections (Thread-Safe Maps)
		// Example: HashMap (Unsafe) vs ConcurrentHashMap (Safe)
		// ======================================================================
		System.out.println("\n4. ConcurrentHashMap Solution:");

		// Unsafe Map (The combined put/get is not atomic and fails)
		Map<String, Integer> unsafeMap = new HashMap<>();
		unsafeMap.put("count", 0);

		// Safe Map (ConcurrentHashMap and its compute() method are thread-safe)
		Map<String, Integer> safeMap = new ConcurrentHashMap<>();
		safeMap.put("count", 0);

		// Run the UNSAFE MAP test
		ExecutorService unsafeMapExecutor = Executors.newVirtualThreadPerTaskExecutor();
		IntStream.range(0, NUM_TASKS).forEach(i -> unsafeMapExecutor.submit(() -> {
			// Read-Modify-Write is NOT atomic on HashMap
			unsafeMap.put("count", unsafeMap.get("count") + 1);
		}));
		unsafeMapExecutor.shutdown();
		unsafeMapExecutor.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println("   Final Count (Unsafe HashMap): " + unsafeMap.get("count") + " (Failed)");


		// Run the SAFE MAP test
		ExecutorService safeMapExecutor = Executors.newVirtualThreadPerTaskExecutor();
		IntStream.range(0, NUM_TASKS).forEach(i -> safeMapExecutor.submit(() -> {
			// compute() performs the Read-Modify-Write cycle atomically
			safeMap.compute("count", (key, value) -> value + 1);
		}));
		safeMapExecutor.shutdown();
		safeMapExecutor.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println("   Final Count (ConcurrentHashMap): " + safeMap.get("count") + " (Success)");

		// The remaining techniques are for specific scenarios:
		// ReentrantLock: For fine-grained control, e.g., using lock.tryLock() for
		// timeouts.
		// ReadWriteLock: For scenarios where reads far outnumber writes (allows many
		// concurrent readers).
	}
}