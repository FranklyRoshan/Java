package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolingDemo {

    // Define the task to be executed by the threads
    static class MyTask implements Runnable {
        private final int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            // The same worker thread will execute multiple tasks (taskId 0 through 999)
            System.out.println(
                Thread.currentThread().getName() + 
                " executing task ID: " + taskId
            );
            // Simulate brief task duration
            try {
                TimeUnit.MILLISECONDS.sleep(5); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        final int TOTAL_TASKS = 10; // Reduced for readable output
        final int POOL_SIZE = 3; 

        // ----------------------------------------------------------------------
        // INEFFICIENCY EXAMPLE (Concept Only - Not Run for System Stability)
        // ----------------------------------------------------------------------
        
        /*
        // Problems Without Thread Pooling:
        // 1. High Overhead: Creates a new Thread object for every task (expensive!).
        // 2. Limited Scalability: Can quickly overwhelm system resources.
        
        System.out.println("--- 1. Without a Thread Pool (Inefficient) ---");
        for (int i = 0; i < 1000; i++) {
            // new Thread().start(); // Creates 1000 separate, unique Thread objects
            // System.out.println("Created Thread: " + i);
        }
        */

        // ----------------------------------------------------------------------
        // EFFICIENT EXAMPLE: Using a Thread Pool (ExecutorService)
        // ----------------------------------------------------------------------
        
        System.out.println("--- 2. Using a Fixed Thread Pool (Efficient) ---");
        System.out.printf("Creating an ExecutorService with %d worker threads.%n", POOL_SIZE);

        // Executors.newFixedThreadPool(10): Creates an ExecutorService with a fixed number of threads.
        // Solves the problem by limiting threads and enabling reuse.
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);

        System.out.printf("Submitting %d tasks to the pool...%n", TOTAL_TASKS);
        
        for (int i = 0; i < TOTAL_TASKS; i++) {
            // pool.execute(): Submits the Runnable task to the pool. 
            // The pool assigns the task to one of the 3 existing threads.
            pool.execute(new MyTask(i)); 
        }

        // ----------------------------------------------------------------------
        // Key Management Steps
        // ----------------------------------------------------------------------
        
        // Stops the pool from accepting new tasks. Existing tasks finish execution.
        pool.shutdown(); 
        
        // Wait up to 5 seconds for all tasks to finish execution gracefully.
        // This is part of the "Easy to Manage" benefit.
        if (pool.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.println("\nAll tasks finished execution gracefully.");
        } else {
            System.err.println("\nNot all tasks finished within the timeout.");
        }

        System.out.println("\nFinal Check: The output shows the same thread names (pool-1-thread-X) executing multiple tasks.");
    }
}
