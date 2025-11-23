package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ConcurrentUtilitiesDemo {

    // --- 1. ThreadLocal Example (Thread Isolation) ---
    // Why: Each thread gets its own separate instance of the counter.
    private static ThreadLocal<Integer> threadLocalCount = ThreadLocal.withInitial(() -> 0);

    // --- 2. Semaphore Example (Bounded Access Control) ---
    // Why: Allows only 2 threads to access the critical section at a time.
    private static Semaphore limitedAccessSemaphore = new Semaphore(2);

    // --- 3. CountDownLatch Example (Task Coordination) ---
    // Why: The main thread will wait for 3 specific tasks to complete.
    private static CountDownLatch startupLatch = new CountDownLatch(3);

    // Worker class combining the concepts
    static class Worker implements Runnable {
        private final String workerName;

        Worker(String name) {
            this.workerName = name;
        }

        @Override
		public void run() {
            // --- 1. ThreadLocal Demo ---
            // Set the ThreadLocal value to a random number, independent for each worker
            int initialValue = ThreadLocalRandom.current().nextInt(100);
            threadLocalCount.set(initialValue);
            System.out.printf("   [TL] %s initialized its local count to %d%n", workerName, threadLocalCount.get());

            // --- 2. Semaphore Demo ---
            try {
                System.out.printf("   [SE] %s trying to acquire access...%n", workerName);
                limitedAccessSemaphore.acquire(); // Blocks if no permit is available

                System.out.printf("   [SE] %s acquired permit and is working (Shared Resource Access).%n", workerName);
                TimeUnit.MILLISECONDS.sleep(500); // Simulating work with a shared resource

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                limitedAccessSemaphore.release(); // Must always release the permit
                System.out.printf("   [SE] %s released permit.%n", workerName);
            }

            // --- 3. CountDownLatch Demo ---
            // Only the first three threads will contribute to the Latch count.
            if (workerName.matches("Worker-\\d+")) {
                startupLatch.countDown(); // Reduce the latch count by 1
                System.out.printf("   [L] %s finished critical startup task. Latch remaining: %d%n", 
                                  workerName, startupLatch.getCount());
            }

            // Final check on the ThreadLocal value (should still be its unique initial value)
            System.out.printf("   [TL] %s final local count: %d%n", workerName, threadLocalCount.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- Advanced Concurrency Utilities Demo ---");

        // Start 5 workers. Only 2 can access the Semaphore resource concurrently.
        // Only the first 3 (Worker-0, 1, 2) will contribute to the Latch countdown.
        for (int i = 0; i < 5; i++) {
            new Thread(new Worker("Worker-" + i)).start();
        }

        // --- CountDownLatch: The main thread waits here ---
        System.out.println("\n[L] Main thread waiting for the 3 critical startup tasks to finish...");
        
        // await() blocks until startupLatch count reaches zero (i.e., 3 workers finished)
        startupLatch.await(); 

        System.out.println("\n[L] SUCCESS: All 3 critical startup tasks finished. Main program starting.");
    }
}

/*
 * 🛠️ When to Use Advanced Concurrency Utilities 1. ThreadLocal: Thread
 * Isolation (No Shared Data) 🚫 What it is: A variable that provides a
 * separate, independent copy of its value for each thread that accesses it.
 * 
 * Why use it: It is the ultimate way to eliminate race conditions and the need
 * for synchronization because data is not shared. If a thread needs a resource
 * only for the duration of its task (like a transaction ID or user session
 * data), giving it its own unique instance prevents conflicts.
 * 
 * When to use it:
 * 
 * Caching per-thread data: Storing a database connection or a SimpleDateFormat
 * object, where creating a new instance is costly, but sharing a single
 * instance is dangerous (due to lack of thread safety).
 * 
 * Context propagation: Carrying user session details or transaction IDs across
 * different method calls within the same request-handling thread.
 * 
 * 2. Semaphore: Bounded Access Control (Resource Throttling) 🚦 What it is: A
 * counting semaphore that maintains a set of permits. Threads must acquire() a
 * permit to proceed and release() it when done.
 * 
 * Why use it: It controls the number of threads that can concurrently access a
 * critical resource. Unlike a basic lock (which grants access to only one
 * thread), a semaphore can allow N threads access.
 * 
 * When to use it:
 * 
 * Controlling concurrent access: Limiting connections to a finite resource like
 * a database connection pool, an external API, or a limited number of
 * processing units.
 * 
 * Resource Throttling: Preventing system overload by ensuring that only a
 * maximum number of concurrent tasks are running at any given time.
 * 
 * 3. CountDownLatch: Task Coordination (Waiting for Completion) ⏱️ What it is:
 * A synchronization aid that allows one or more threads to wait until a set of
 * operations being performed in other threads completes. It's initialized with
 * a count, and threads call countDown() when they finish. The main thread calls
 * await() and blocks until the count reaches zero.
 * 
 * Why use it: It provides a simple, robust way to implement a start gate or
 * wait for the initialization of a service composed of multiple independent
 * components.
 * 
 * When to use it:
 * 
 * Waiting for multiple tasks to complete: Ensuring all required setup or
 * configuration tasks are finished before the main application logic starts.
 * 
 * Implementation of start/stop gates: Holding a large set of threads until a
 * start signal is given (by calling countDown() the required number of times).
 * 
 */
