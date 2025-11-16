package com.frank.java_platform;

public class JITExample {

	public static void main(String[] args) {
		long start = System.nanoTime();
		for (int i = 0; i < 10_000_000; i++) {
			compute();
		}

		long end = System.nanoTime();
		System.out.println("Execution Time: " + (end - start) + " ns");
	}

	static void compute() {
		int x = 5 * 10;
	}

}
/*
 * What is Just-In-Time (JIT) Compilation? #
 *
 * What?: JVM monitors method execution and compiles frequently used code paths
 * into efficient machine code.
 *
 * Why?: Improves performance by avoiding repeated interpretation of "hot" spots
 *
 * Example: Initially, compute() is interpreted by the JVM. As it is called
 * millions of times, the JIT compiler identifies it as a "hot spot". The JVM
 * compiles it into native machine code, improving performance.
 *
 */
