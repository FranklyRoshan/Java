package com.frank.ThreadsAndConcurrency;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadsDemo {

    // Helper method to simulate a typical I/O wait (the kind of task Virtual Threads excel at)
    private static void performIOBoundTask(int id) {
        try {
            // Simulate a database query or API call wait time
            Thread.sleep(Duration.ofMillis(1)); 
            System.out.println("   Task " + id + " finished on: " + Thread.currentThread());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("--- Java Virtual Threads Demonstration (Massive Concurrency) ---");
        
        // Context: Java introduced Virtual Threads to solve scalability issues with Platform Threads.
        // Platform Threads: Map 1:1 to OS Threads, high memory usage, limited scalability.
        // Virtual Threads: Map Many:1 to OS Threads, low memory usage, scales to millions.
        
        final int TASK_COUNT = 100_000; // Running 100,000 tasks, impractical for Platform Threads

        System.out.printf("Starting %d I/O-bound tasks using Virtual Threads...%n", TASK_COUNT);
        
        long startTime = System.currentTimeMillis();

        // Executors.newVirtualThreadPerTaskExecutor() provides a simple, modern way 
        // to manage Virtual Threads. It runs each submitted task in a new, independent Virtual Thread.
        
        // This ExecutorService implements AutoCloseable, allowing its use with try-with-resources.
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            
            // Submitting 100,000 tasks efficiently
            IntStream.range(0, TASK_COUNT).forEach(i -> {
                // executor.submit() returns a Future, but we ignore it here for simplicity
                executor.submit(() -> performIOBoundTask(i));
            });

            // The executor's close() method (called automatically by try-with-resources) 
            // waits for all submitted tasks to complete.
        } 
        // End of try-with-resources block. All 100,000 tasks are finished.

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        
        System.out.printf("\nSuccessfully completed %d tasks.%n", TASK_COUNT);
        System.out.printf("Total Execution Time: %d ms%n", totalTime);
        System.out.println("Result: Achieving high concurrency (100k threads) with low overhead.");
    }
}
