package com.frank.java_platform;

public class MethodInline {

	public static void main(String[] args) {
		long start = System.nanoTime();
		for (int i = 0; i < 10_000_000; i++) {
			// JVM may inline this method
			System.out.println(add(i, i + 1));
		}
		long end = System.nanoTime();

		System.out.println("Execution Time: " + (end - start) + "ns");
	}

	static int add(int a, int b) {
		// Small method, likely to be inlined
		return a + b;
	}

}

/*
 * Method Inlining
 *
 * What?: Replaces a method call with its actual body to avoid function call
 * overhead.
 *
 * Why?: Reduces method call latency and improves execution speed.
 *
 *
 * Optimization in Action
 *
 * Detects add() as small and frequently used. Instead of making method calls,
 * it inserts the logic directly into the loop. This eliminates function call
 * overhead and speeds up execution.
 *
 */
