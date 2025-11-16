package com.frank.java_platform;

public class LoopUnrollingExample {
	public static void main(String[] args) {
		int sum = 0;
		// Instead of iterating 4 times
		// JVM may unroll this into direct additions
		for (int i = 0; i < 4; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

/*
 * Loop Unrolling
 *
 * What?: Expands loop iterations to reduce loop control overhead (e.g.,
 * branching and index updates).
 *
 * Why?: Fewer iterations mean less CPU time wasted on loop conditions.
 *
 *
 * Optimization in Action Loop may be re-written as:
 *
 * sum += 0; sum += 1; sum += 2; sum += 3;
 *
 * This removes the loop condition check and improves performance.
 *
 */