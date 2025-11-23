package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadControlDemo {

    // Helper class for join() demonstration
    static class MyThread extends Thread {
        private final String threadName;
        private final int iterations = 3;

        public MyThread(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.printf("   [JOIN] %s started processing...%n", threadName);
            IntStream.rangeClosed(1, iterations).forEach(i -> {
                // Simulate some work being done
                try {
                    TimeUnit.MILLISECONDS.sleep(100); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            System.out.printf("   [JOIN] %s finished execution.%n", threadName);
        }
    }
    
    // Class for yield() demonstration
    static class YieldExample implements Runnable {
        private final String threadName;

        public YieldExample(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.printf("--- YIELD Demonstration for %s ---%n", threadName);
            for (int i = 0; i < 5; i++) {
                System.out.println("   [YIELD] " + threadName + " is running.");
                
                // Giving a hint to the scheduler that the current thread can pause execution
                Thread.yield(); 
            }
        }
    }

    // Class for sleep() demonstration
    static class SleepExample implements Runnable {
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            System.out.printf("--- SLEEP Demonstration for %s ---%n", name);
            
            System.out.printf("   [SLEEP] %s is running, going to sleep for 3 seconds...%n", name);
            
            try {
                // Puts the current thread to sleep for 3000 milliseconds
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                // Throws InterruptedException if another thread interrupts it while sleeping
                System.out.printf("   [SLEEP] %s was interrupted!%n", name);
            }
            
            System.out.printf("   [SLEEP] %s woke up!%n", name);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("==============================================");
        System.out.println("        1. THREAD JOIN() DEMONSTRATION        ");
        System.out.println("==============================================");
        
        Thread t1 = new MyThread("T1");
        Thread t2 = new MyThread("T2");

        t1.start();
        // Main thread waits for t1 to complete before proceeding
        System.out.println("Main thread waiting for T1 to finish (join())...");
        t1.join(); 

        t2.start();
        // Main thread waits maximum of 1 second for t2 to finish
        System.out.println("Main thread waiting max 1 sec for T2 (join(1000))...");
        t2.join(1000); 

        System.out.println("\nMain thread finished waiting and continues execution.");
        
        // ----------------------------------------------------------------------
        
        System.out.println("\n==============================================");
        System.out.println("        2. THREAD SLEEP() DEMONSTRATION       ");
        System.out.println("==============================================");

        // Start a thread that will sleep for 3 seconds
        new Thread(new SleepExample(), "Sleep-Thread").start();
        
        Thread.sleep(100); // Give sleep thread a chance to start

        // ----------------------------------------------------------------------

        System.out.println("\n==============================================");
        System.out.println("         3. THREAD YIELD() DEMONSTRATION      ");
        System.out.println("==============================================");
        
        // Start two threads with the yield hint
        new Thread(new YieldExample("Yield-A")).start();
        new Thread(new YieldExample("Yield-B")).start();
    }
}