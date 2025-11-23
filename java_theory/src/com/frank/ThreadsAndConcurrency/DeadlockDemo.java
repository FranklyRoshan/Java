package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.TimeUnit;

public class DeadlockDemo {

    // Helper class representing the shared resources
    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        // Method to attempt to lock this resource and then the 'other' resource
        void use(Resource other) {

            // Step 1: Lock the first resource ('this')
            // Condition: Mutual Exclusion & Hold and Wait
            synchronized (this) {
                
                System.out.println(
                    Thread.currentThread().getName() + 
                    " has locked " + this.name + " and is waiting for " + other.name);
                
                // Pause briefly to ensure the other thread can acquire its first lock
                // This maximizes the chance of the circular wait condition being met
                try {
                    TimeUnit.MILLISECONDS.sleep(100); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                // Step 2: Attempt to lock the second resource ('other')
                // This is the point where the deadlock occurs if the circular wait is established.
                synchronized (other) { 
                    System.out.println(
                        Thread.currentThread().getName() + 
                        " successfully locked BOTH resources: " + this.name + " and " + other.name);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        System.out.println("--- Deadlock Situation Demo ---");
        
        Resource resourceA = new Resource("Resource A");
        Resource resourceB = new Resource("Resource B");
        
        // --- Setup for Circular Wait ---

        // Thread-1: Locks A, then waits for B (A -> B)
        Thread t1 = new Thread(() -> {
            System.out.println("Setting up T1: Lock A then B.");
            resourceA.use(resourceB);
        }, "Thread-1");

        // Thread-2: Locks B, then waits for A (B -> A)
        Thread t2 = new Thread(() -> {
            System.out.println("Setting up T2: Lock B then A.");
            resourceB.use(resourceA);
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
        
        // Wait indefinitely to confirm the freeze
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nIf this line prints, the deadlock was avoided (unlikely).");
        System.out.println("If the program freezes here, a deadlock occurred.");
    }
}
