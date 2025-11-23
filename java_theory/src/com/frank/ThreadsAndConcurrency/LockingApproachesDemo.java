package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class LockingApproachesDemo {

	private static final int NUM_INCREMENTS = 10000;
	private static final int NUM_THREADS = 1000;
	private static final int EXPECTED_COUNT = NUM_INCREMENTS * NUM_THREADS; // 10,000,000

	// --- 1. Synchronized Method (Coarse-Grained Locking) ---
	static class BiCounterSynchronizedMethod {
		private int i = 0;
		private int j = 0;

		// PROBLEM: Locks the entire object. incrementI() blocks incrementJ().
		synchronized public void incrementI() {
			i++;
		}

		synchronized public void incrementJ() {
			j++;
		}

		// Safety check helper: Should always equal EXPECTED_COUNT if thread-safe
		public boolean isSafe() {
			return i == NUM_INCREMENTS * NUM_THREADS;
		}
	}

	// --- 2. Synchronized Block with Dedicated Locks (Fine-Grained Locking) ---
	static class BiCounterSynchronizedBlock {
		private int i = 0;
		private int j = 0;

		// SOLUTION: Create separate private final lock objects for each independent
		// resource
		private final Object lockForI = new Object();
		private final Object lockForJ = new Object();

		public void incrementI() {
			// Locks ONLY the lockForI object, allowing other threads to access lockForJ.
			synchronized (lockForI) {
				i++;
			}
		}

		public void incrementJ() {
			synchronized (lockForJ) {
				j++;
			}
		}
	}

	// --- 3. ReentrantLock (Fine-Grained and Explicit Locking) ---
	static class BiCounterWithReentrantLock {
		private int i = 0;
		private int j = 0;

		// Uses the explicit Lock interface for maximum control
		private Lock lockForI = new ReentrantLock();
		private Lock lockForJ = new ReentrantLock();

		public void incrementI() {
			lockForI.lock(); // Manually acquire the lock
			try {
				i++; // Critical section
			} finally {
				lockForI.unlock(); // ALWAYS release the lock in a finally block!
			}
		}

		public void incrementJ() {
			lockForJ.lock();
			try {
				j++;
			} finally {
				lockForJ.unlock();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("--- Locks vs. Synchronized Approaches Demo ---");
		System.out.println("Goal: Safely perform " + EXPECTED_COUNT + " increments on both i and j.");
		System.out.println("-----------------------------------------------------");

		// Use Virtual Threads for highly concurrent, quick testing
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

		// --- 1 & 2. Synchronized Examples ---
		// Note: The fine-grained block approach (Example 2) is almost always preferred
		// over the coarse-grained method approach (Example 1) for performance.
		BiCounterSynchronizedMethod counterSyncMethod = new BiCounterSynchronizedMethod();
		BiCounterSynchronizedBlock counterSyncBlock = new BiCounterSynchronizedBlock();

		// --- 3. ReentrantLock Example ---
		BiCounterWithReentrantLock counterLock = new BiCounterWithReentrantLock();

		// Submit tasks to all three counters concurrently
		IntStream.range(0, NUM_THREADS).forEach(threadIndex -> {
			executor.submit(() -> {
				IntStream.range(0, NUM_INCREMENTS).forEach(i -> {
					// Task: Increment all three counters
					counterSyncMethod.incrementI();
					counterSyncMethod.incrementJ();

					counterSyncBlock.incrementI();
					counterSyncBlock.incrementJ();

					counterLock.incrementI();
					counterLock.incrementJ();
				});
			});
		});

		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.SECONDS);

		System.out.println("\nVerification:");
		System.out.println("Expected Final Value (i and j): " + EXPECTED_COUNT);

		// Check results: All three methods provide thread safety and should yield the
		// correct count.
		System.out.printf("1. Synchronized Method: i=%d, j=%d (Safe but Coarse-Grained)%n", counterSyncMethod.i,
				counterSyncMethod.j);

		System.out.printf("2. Synchronized Block: i=%d, j=%d (Safe and Fine-Grained)%n", counterSyncBlock.i,
				counterSyncBlock.j);

		System.out.printf("3. ReentrantLock: i=%d, j=%d (Safe, Fine-Grained, and Flexible)%n", counterLock.i,
				counterLock.j);

		System.out.println("\nKey Takeaway: All three methods successfully prevent the race condition.");
		System.out.println("However, ReentrantLock offers advanced features like tryLock() and interruptibility.");
	}
}