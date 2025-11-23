package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

// Class where the shared, mutable data resides
class Counter {
    // This is the shared resource accessed by all threads
    private int count = 0; 

    public void increment() {
        // count++ is a NOT thread-safe operation (Read -> Modify -> Write)
        count++; 
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSafetyDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- Thread Safety and Race Condition Demo ---");

        Counter counter = new Counter();
        
        // Using Virtual Threads to easily simulate massive concurrent access
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        // Each task will call increment() 10 times
        final int INCREMENTS_PER_TASK = 10;
        
        // Total number of tasks submitted
        final int NUM_TASKS = 100000; 

        // Expected final count if no race condition occurs
        final int EXPECTED_COUNT = INCREMENTS_PER_TASK * NUM_TASKS; // 10 * 100,000 = 1,000,000

        Runnable task = () -> {
            IntStream.range(0, INCREMENTS_PER_TASK).forEach(i -> counter.increment());
        };

        // Submit 100,000 tasks, each trying to increment the shared 'count' concurrently
        IntStream.range(0, NUM_TASKS).forEach(i -> executor.submit(task));

        executor.shutdown();

        // Wait for all tasks to finish (up to 10 seconds)
        if (executor.awaitTermination(10, TimeUnit.SECONDS)) {
            
            System.out.println("\nRace Condition Analysis:");
            System.out.println("   Expected Final Count: " + EXPECTED_COUNT);
            
            // The value obtained from getCount() will likely be LESS than 1,000,000
            // due to lost updates caused by the non-atomic nature of count++.
            System.out.println("   Actual Final Count (Unsafe): " + counter.getCount()); 
            
            if (counter.getCount() != EXPECTED_COUNT) {
                System.err.println("   Result: RACE CONDITION DETECTED! Lost updates occurred.");
            } else {
                 System.out.println("   Result: Lucky run! Race condition *possible* but not exhibited.");
            }

        } else {
            System.err.println("Executor timed out before all tasks finished.");
        }
    }
}

/*
 * 🛡️ What is Thread Safety? Thread Safety ensures that code or a data
 * structure will function correctly when accessed concurrently by multiple
 * threads. In simpler terms, if a class is thread-safe, multiple threads can
 * call its methods simultaneously without causing conflicts, errors, or
 * unpredictable results. It guarantees correct behavior in a multithreaded
 * environment.
 * 
 * 🏁 What are Race Conditions? A Race Condition occurs when two or more threads
 * access shared mutable data at the same time, and the final outcome of the
 * program depends on the unpredictable sequence or timing in which the threads
 * execute their instructions.
 * 
 * The classic example of a race condition involves the simple increment
 * operation (count++).
 * 
 * The Problem: count++ is Not Atomic The statement count++ looks like a single
 * operation, but at the CPU level, it is a non-atomic Read-Modify-Write
 * sequence:
 * 
 * Read: Load the value of count from memory into a CPU register.
 * 
 * Modify: Increment the value in the register.
 * 
 * Write: Store the new value from the register back into memory (count).
 * 
 * Since this process is not atomic (meaning it can be interrupted), another
 * thread can "sneak in" between these steps, leading to a Lost Update
 * 
 */