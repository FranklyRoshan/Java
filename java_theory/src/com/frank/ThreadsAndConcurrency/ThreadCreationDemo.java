package com.frank.ThreadsAndConcurrency;

import java.util.stream.IntStream;

public class ThreadCreationDemo {

	// ----------------------------------------------------------------------
	// 1. Extending Thread Class (Less Recommended)
	// ----------------------------------------------------------------------

	/**
	 * class CountdownThread extends Thread { - Consumes the single inheritance
	 * slot. - The task (run method) is tightly coupled with the Thread object. }
	 */
	static class CountdownThread extends Thread {
		private final String name;

		public CountdownThread(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println("-> Thread Class: " + name + " started.");
			// Example task: Print a short countdown
			IntStream.rangeClosed(1, 3).forEach(i -> System.out.println("   " + name + " Count: " + i));
		}
	}

	// ----------------------------------------------------------------------
	// 2. Implementing Runnable Interface (Recommended Approach)
	// ----------------------------------------------------------------------

	/**
	 * class CountdownTask implements Runnable { - Frees up the inheritance slot. -
	 * Decouples the task from the executor (Thread). }
	 */
	static class CountdownTask implements Runnable {
		private final String name;

		public CountdownTask(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			// Thread.currentThread() identifies the thread executing the task
			System.out.println("-> Runnable Task: " + name + " started by Thread: " + Thread.currentThread().getName());
			// Example task: Print a short countdown
			IntStream.rangeClosed(1, 3).forEach(i -> System.out.println("   " + name + " Count: " + i));
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("--- 1. Extending Thread Class Demo ---");
		// Creating two separate Thread objects, each with its own task logic instance
		new CountdownThread("T-Ext-1").start();
		new CountdownThread("T-Ext-2").start();

		Thread.sleep(150); // Pause to separate output

		System.out.println("\n--- 2. Implementing Runnable Interface Demo ---");

		// Resource Sharing Advantage:
		// We create ONE Runnable object (the task)
		Runnable sharedTask = new CountdownTask("R-Task-Shared");

		// We use that ONE task object to instantiate MULTIPLE Thread objects
		// The task logic is shared efficiently.
		new Thread(sharedTask, "R-Thread-1").start();
		new Thread(sharedTask, "R-Thread-2").start();

		Thread.sleep(150); // Pause to separate output

		// Modern approach uses a Lambda (Runnable is a Functional Interface)
		System.out.println("\n--- 3. Modern Runnable (Lambda) Demo ---");
		new Thread(() -> System.out.println("-> Runnable Lambda started.")).start();
	}
}