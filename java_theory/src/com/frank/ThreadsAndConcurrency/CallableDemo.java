package com.frank.ThreadsAndConcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * You should use the Callable interface instead of Runnable whenever the concurrent task 
 * you are executing is expected to return a result or needs to throw a checked exception.
 *
 * The primary difference is that Callable's single method is call() which is declared to 
 * return a value of a parameterized type (V) and can throw a checked Exception, while 
 * Runnable's run() method returns void and cannot throw checked exceptions.
 */

public class CallableDemo {

	// ----------------------------------------------------------------------
	// 1. Implementing Callable<V>
	// ----------------------------------------------------------------------

	/**
	 * class FactorialTask implements Callable<Integer> { - The <Integer> specifies
	 * the return type of the call() method. - The call() method can throw a checked
	 * Exception.
	 */
	static class FactorialTask implements Callable<Integer> {

		private int number;

		FactorialTask(int number) {
			this.number = number;
		}

		/**
		 * The concurrent task logic.
		 * 
		 * @return The calculated factorial.
		 * @throws Exception If the input number is negative.
		 */
		@Override
		public Integer call() throws Exception {
			if (number < 0) {
				// Ability to throw a checked exception is a key advantage of Callable
				throw new Exception("Factorial is not defined for negative numbers.");
			}

			System.out.printf("   [Task] Calculating factorial of %d in thread: %s%n", number,
					Thread.currentThread().getName());

			int result = 1;
			for (int i = 2; i <= number; i++) {
				result *= i;
			}

			return result;
		}
	}

	public static void main(String[] args) {

		System.out.println("--- Callable vs. Runnable Demo ---");

		// ExecutorService is used to submit Callable tasks
		ExecutorService executor = Executors.newSingleThreadExecutor();

		try {
			// ----------------------------------------------------------------------
			// Successful Execution (Returns a Value)
			// ----------------------------------------------------------------------

			// submit() returns a Future object, which holds the result (or exception)
			Future<Integer> future = executor.submit(new FactorialTask(5));

			// future.get() is a blocking call that waits for the result from the call()
			// method
			int factorialResult = future.get();

			System.out.println("   Main Thread retrieved result.");
			System.out.println("   Factorial of 5: " + factorialResult); // Output: 120

			// ----------------------------------------------------------------------
			// Execution with Exception Handling
			// ----------------------------------------------------------------------

			Future<Integer> negativeFuture = executor.submit(new FactorialTask(-1));

			try {
				// Calling get() throws an ExecutionException if the call() method threw an
				// exception
				negativeFuture.get();
			} catch (Exception e) {
				System.err.println("\n   Caught Expected Exception:");
				// The exception thrown by call() is wrapped in ExecutionException
				System.err.println("   Error Message: " + e.getCause().getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Always shut down the executor service
			executor.shutdown();
		}
	}
}