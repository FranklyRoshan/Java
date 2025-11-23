package com.frank.ThreadsAndConcurrency;

/*
 *The thread lifecycle is a sequence of transitions from birth to death: 
 *NEW > RUNNABLE/RUNNING > BLOCKED/WAITING > TERMINATED .
 */

public class ThreadStatesDemo {

	// Shared object used for synchronization (locking)
	public static final Object LOCK = new Object();

	// The task that the thread will execute
	static class DemonstrateStates implements Runnable {
		@Override
		public void run() {
			// Task: Simulate BLOCKED state by waiting for a lock
			synchronized (LOCK) {
				System.out.println("   -> [BLOCKED] Thread has acquired lock. ");
				try {
					// Simulating WAITING state by calling sleep()
					Thread.sleep(100);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			} // Lock is released here
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new DemonstrateStates(), "Demo-Thread");

		// 1. NEW State
		System.out.println("1. State after creation: " + t.getState());

		t.start();

		// 2. RUNNABLE State
		// It enters RUNNABLE immediately after start(), waiting for the CPU.
		System.out.println("2. State after start(): " + t.getState());

		// Sleep the main thread briefly to allow 't' to start and acquire the lock
		Thread.sleep(50);

		// --- Simulate BLOCKED/WAITING by having another thread wait for the same lock
		// ---
		synchronized (LOCK) {
			// 3. BLOCKED/WAITING State
			// The Demo-Thread 't' is now inside its synchronized block and has called
			// sleep(100)
			// It is currently in the WAITING state.
			// If another thread (not shown) tried to acquire the lock here, it would be
			// BLOCKED.
			System.out.println("3. State while executing sleep(100): " + t.getState());

			// 4. WAITING/TIMED_WAITING State
			// Now the main thread sleeps for a longer time.
			Thread.sleep(500);
			// While the main thread is here, the Demo-Thread 't' is still TIMED_WAITING
			// inside the sleep(100).
			System.out.println("4. State while main thread sleeps: " + t.getState());

			// Lock is released when the main thread exits this synchronized block
		}

		// Wait for the thread to finish its job
		t.join();

		// 5. TERMINATED State
		System.out.println("5. State after join() completes: " + t.getState());
	}
}