package com.frank.ThreadsAndConcurrency;

public class ProcessThreadMemoryDemo {

    // 🧠 Shared Memory: This static variable simulates a resource (Heap Memory)
    // shared by all threads within this single OS Process.
    private static int sharedCounter = 0; 
    
    // The amount each thread will increment the counter
    private static final int INCREMENT_AMOUNT = 10000;

    // The task that represents a unit of execution (Thread)
    static class ThreadTask implements Runnable {
        private final String threadName;

        public ThreadTask(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.printf("   [Thread %s] Starting modification of shared memory...%n", threadName);
            
            // Threads access and modify the single shared variable 'sharedCounter'
            for (int i = 0; i < INCREMENT_AMOUNT; i++) {
                sharedCounter++;
            }
            
            System.out.printf("   [Thread %s] Finished. Shared Counter is now approx: %d%n", threadName, sharedCounter);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--- OS Process vs. Thread Memory Demo ---");
        System.out.println("Theory: Threads share memory within the same Process.");

        // 1. Create two threads (units of execution)
        Thread threadA = new Thread(new ThreadTask("A"));
        Thread threadB = new Thread(new ThreadTask("B"));

        long expectedResult = 2 * INCREMENT_AMOUNT; // 20000
        
        // 2. Start the threads concurrently
        threadA.start();
        threadB.start();

        // 3. Wait for both threads to finish their execution
        threadA.join();
        threadB.join();

        // 4. Verification
        System.out.println("\nVerification:");
        System.out.printf("   Expected Shared Result: %d%n", expectedResult);
        System.out.printf("   Final Shared Counter Value: %d%n", sharedCounter); 
        
        // Note: The final value might be slightly less than 20000 due to race conditions (showing concurrent access).
        System.out.println("Conclusion: Both threads accessed and modified the single 'sharedCounter' variable.");
        System.out.println("This is only possible because they belong to the SAME OS Process and share HEAP memory.");
    }
}

/*
 * Feature - OS Process (Heavyweight) - OS Thread (Lightweight)
 * 
 * 📚 Definition - Independent program execution (Container) - A sequential flow
 * of control inside a Process
 * 
 * 🧠 Memory -
 * "Each process has its own separate	-	private memory space",Shared memory
 * within a Process (Threads share the heap)
 * 
 * ⚡Speed - "Slow to start, expensive context switching" -
 * "Faster to start, efficient context switching"
 * 
 * 💡 Example - Google Chrome application instance - Each Google Chrome Tab or a
 * background spell-check worker
 */
