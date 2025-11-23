package com.frank.ThreadsAndConcurrency;

//The worker thread that performs the computation and signals completion
class Calculator extends Thread {
	// Shared variable to store the result
	// This is accessed by the Main thread after notification
	long sumUptoMillion;

	// Helper method to perform the resource-intensive calculation
	private void calculateSumUptoMillion() {
		System.out.println("   [T2 - Calculator] Starting heavy computation...");
		long sum = 0;
		// Perform the calculation
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		this.sumUptoMillion = sum;
		System.out.println("   [T2 - Calculator] Computation finished. Sum calculated.");
	}

	@Override
	public void run() {
		// Must synchronize on the object being used for wait()/notify()
		synchronized (this) {
			calculateSumUptoMillion();
			// notify() wakes up one thread waiting on this object's monitor (Main thread)
			notify();
		}
		// Note: The lock is only released when the synchronized block completes
	}
}

public class ThreadWaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("--- Inter-Thread Communication (wait() and notify()) ---");

		Calculator calculatorThread = new Calculator();

		// --- Main Thread (T1) Logic ---

		// IMPORTANT: Must synchronize on the EXACT same object instance
		// (calculatorThread)
		synchronized (calculatorThread) {
			System.out.println("[T1 - Main] Starting Calculator thread (T2).");
			calculatorThread.start(); // Start calculation thread (T2)

			System.out.println("[T1 - Main] Entering wait() state to pause execution...");

			// T1 releases the lock on 'calculatorThread' and moves to the WAITING state.
			calculatorThread.wait();

			// T1 wakes up when notify() is called by T2, re-acquires the lock, and resumes.
			System.out.println("[T1 - Main] Resuming execution after notification from T2.");
		}
		// Lock on 'calculatorThread' is released here.

		// Accessing the result after successful synchronization
		System.out.println("-----------------------------------------------------");
		System.out.println("Final Sum up to 1,000,000: " + calculatorThread.sumUptoMillion);
	}
}
