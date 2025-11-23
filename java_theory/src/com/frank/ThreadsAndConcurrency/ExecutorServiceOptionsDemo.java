package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ExecutorServiceOptionsDemo {

    // Helper task class for non-scheduled executors
    static class Task implements Runnable {
        private final String message;
        
        public Task(String msg) {
            this.message = msg;
        }

        @Override
        public void run() {
            System.out.println("   " + Thread.currentThread().getName() + " executing: " + message);
        }
    }
    
    // Helper task class for scheduled executors
    static class ScheduledTask implements Runnable {
        private final String message;

        public ScheduledTask(String msg) {
            this.message = msg;
        }

        @Override
        public void run() {
            System.out.println("   [SCHEDULED] " + Thread.currentThread().getName() + " running: " + message);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- ExecutorService Creation Options Demo ---");
        
        // ----------------------------------------------------------------------
        // 1. Single Thread Executor (For Serialization)
        // ----------------------------------------------------------------------
        System.out.println("\n1. Single Thread Executor (Ensures Order)");
        // Executors.newSingleThreadExecutor(): Single worker thread executes tasks sequentially.
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        // Tasks will be executed in the exact order they are submitted (Login then Logout)
        singleExecutor.execute(new Task("Logging event: User Login"));
        singleExecutor.execute(new Task("Logging event: User Logout"));

        singleExecutor.shutdown();
        singleExecutor.awaitTermination(1, TimeUnit.SECONDS);

        // ----------------------------------------------------------------------
        // 2. Fixed Thread Pool (For Limited Parallelism)
        // ----------------------------------------------------------------------
        System.out.println("\n2. Fixed Thread Pool (Limited Concurrency)");
        final int FIXED_POOL_SIZE = 3;
        // Executors.newFixedThreadPool(int n): Pool with a fixed number of threads (3 here).
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(FIXED_POOL_SIZE);

        // Submitting 5 tasks to demonstrate thread reuse by 3 threads
        IntStream.rangeClosed(1, 5).forEach(i -> 
            fixedExecutor.execute(new Task("File Upload " + i))
        );

        fixedExecutor.shutdown();
        fixedExecutor.awaitTermination(1, TimeUnit.SECONDS);

        // ----------------------------------------------------------------------
        // 3. Single Thread Scheduled Executor (For Serialized Recurring Jobs)
        // ----------------------------------------------------------------------
        System.out.println("\n3. Single Thread Scheduled Executor (Serialized Scheduling)");
        // newSingleThreadScheduledExecutor(): Single background thread supports delayed/periodic execution.
        ScheduledExecutorService singleScheduler = Executors.newSingleThreadScheduledExecutor();

        // Run once after 1 second (demonstrates delay)
        singleScheduler.schedule(new ScheduledTask("One-time DB Cleanup"), 1, TimeUnit.SECONDS);
        // Run every 2 seconds (demonstrates fixed rate)
        singleScheduler.scheduleAtFixedRate(new ScheduledTask("Daily Report Generation"), 0, 2, TimeUnit.SECONDS);
        
        // Let it run for a moment to see the scheduled output
        Thread.sleep(2500);
        singleScheduler.shutdownNow();


        // ----------------------------------------------------------------------
        // 4. Scheduled Thread Pool (For Parallel Recurring Jobs)
        // ----------------------------------------------------------------------
        System.out.println("\n4. Scheduled Thread Pool (Parallel Scheduling)");
        // Executors.newScheduledThreadPool(int corePoolSize): Supports scheduling using multiple threads.
        ScheduledExecutorService parallelScheduler = Executors.newScheduledThreadPool(2);

        // Run every 1 second using multiple threads (demonstrates concurrency in scheduling)
        parallelScheduler.scheduleAtFixedRate(new ScheduledTask("Server Health Check"), 0, 1, TimeUnit.SECONDS);
        parallelScheduler.scheduleAtFixedRate(new ScheduledTask("Log Archival"), 0, 1, TimeUnit.SECONDS);

        Thread.sleep(2500);
        parallelScheduler.shutdownNow();
        
        // ----------------------------------------------------------------------
        // 5. Virtual Thread Per Task Executor (For Massive Concurrency)
        // ----------------------------------------------------------------------
        System.out.println("\n5. Virtual Thread Per Task Executor (Massive I/O)");
        // Executors.newVirtualThreadPerTaskExecutor(): Creates a lightweight Virtual Thread per task.
        // Ideal for I/O-bound tasks where massive concurrency is needed.
        
        try (ExecutorService virtualExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            
            // Submitting three tasks: each will be run by a newly created Virtual Thread
            virtualExecutor.submit( () -> System.out.println("   Virtual Thread 1 running on: " + Thread.currentThread()) );
            virtualExecutor.submit( () -> System.out.println("   Virtual Thread 2 running on: " + Thread.currentThread()) );
            virtualExecutor.submit( () -> System.out.println("   Virtual Thread 3 running on: " + Thread.currentThread()) );
        } // The virtualExecutor is automatically shut down and waits for tasks to finish
        
        System.out.println("\nAll Executors Shut Down.");
    }
}