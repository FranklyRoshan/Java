package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.TimeUnit;

public class DeadlockSolutionDemo {

    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        // The core method that applies the lock ordering logic
        void use(Resource other) {
            
            // --- 1. Determine Lock Order ---
            // Compares resource names lexicographically to decide which resource is 'first' (lower)
            Resource first = this.name.compareTo(other.name) < 0 ? this : other;
            Resource second = this.name.compareTo(other.name) < 0 ? other : this;
            
            // The comparison ensures that if this is Resource B and other is Resource A, 
            // 'first' becomes A and 'second' becomes B.

            // --- 2. Enforce Lock Hierarchy ---
            // Always lock the lower-ranked resource first
            synchronized (first) {
                
                System.out.println(
                    Thread.currentThread().getName() + 
                    " locked " + first.name + " (First Lock)");
                
                try {
                    // Pause briefly to ensure the other thread attempts to acquire its first lock
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                // Now lock the higher-ranked resource second
                synchronized (second) { 
                    System.out.println(
                        Thread.currentThread().getName() + 
                        " locked " + second.name + " (Second Lock)");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("--- Deadlock Solution: Consistent Lock Ordering ---");
        
        Resource resourceA = new Resource("Resource A"); // Lower Rank
        Resource resourceB = new Resource("Resource B"); // Higher Rank

        // Thread-1 requests A then B (Order: A -> B)
        Thread t1 = new Thread(() -> {
            System.out.println("T1 called use(A, B). Calculated order: A -> B.");
            resourceA.use(resourceB); 
        }, "Thread-1");

        // Thread-2 requests B then A (Order: B -> A, but internally corrected)
        Thread t2 = new Thread(() -> {
            System.out.println("T2 called use(B, A). Calculated order: A -> B.");
            resourceB.use(resourceA); 
        }, "Thread-2");

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println("\nSUCCESS: All threads completed execution. Deadlock avoided.");
        System.out.println("The circular wait condition (Condition 4) was broken.");
    }
}