package com.frank.ThreadsAndConcurrency;

public class ThreadPriorityExample {

	// Class where the task is defined
	static class MyThread extends Thread {
		@Override
		public void run() {
			// Retrieve the current thread's name and priority for demonstration
			System.out.println(Thread.currentThread().getName() + " running with priority "
					+ Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) {

		System.out.println("--- Thread Priority Demonstration ---");

		// 1. Create two new thread instances
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		// Naming threads for clearer output
		thread1.setName("Low-Priority-Thread");
		thread2.setName("High-Priority-Thread");

		// 2. Set Thread Priority: Use constants for clear documentation
		// thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1 (Lowest)
		thread1.setPriority(1);

		// thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10 (Highest)
		thread2.setPriority(10);

		// 3. Start execution
		// We expect thread2 (Priority 10) to run before thread1 (Priority 1),
		// but this is not guaranteed!
		thread1.start();
		thread2.start();

		// Check the priority of the main thread (usually 5)
		System.out.println("Main Thread running with default priority " + Thread.currentThread().getPriority());
	}
}