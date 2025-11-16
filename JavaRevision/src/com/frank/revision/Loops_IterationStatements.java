package com.frank.revision;

import java.util.Iterator;
import java.util.List;

// Loops (Iteration Statements)
/*
 * Concept Overview
 * 
 * Loops are used to repeat a block of code until a condition is met or no
 * longer holds true. Every loop consists of three main components:
 * 
 * Initialization – setting up a counter or variable.
 * 
 * Condition – decides whether to continue looping.
 * 
 * Update – changes the loop variable.
 * 
 */


public class Loops_IterationStatements {
	public static void main(String[] args) {

		// For Loop
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		/*
		 * Explanation:
		 * Java/C++ explicitly define loop control.
		 * Python uses the built-in range() function to generate a sequence.
		 * 
		 */
		
		// 2. while Loop
		int i = 1;
		while (i <= 5) {
		    System.out.println(i);
		    i++;
		}
		// 🧠 Used when the number of iterations is unknown beforehand.

		// 3. do-while Loop
		// Runs at least once, even if the condition is false initially.

		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 5);

		// ⚙️ 4. Enhanced / Range-based for Loop
		int[] numbers = { 10, 20, 30 };
		for (int num : numbers) {
			System.out.println(num);
		}

		// 🧠 Simplifies collection traversal — cleaner, less error-prone.

		// ⚙️ 5. Nested Loops
		for (int k = 1; k <= 3; k++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(k + " " + j);
			}
		}

		// 🧩 Use nested loops carefully — complexity grows fast (O(n²), O(n³), ...)

		// ⚙️ 6. Loop Control Statements
		// break - Exits the loop immediately - if (x == 5) break;
		// continue - Skips to the next iteration - if (x % 2 == 0) continue;
		// goto - Avoided in modern code - goto label; (only in C++)
		for (int a = 1; a <= 5; a++) {
			if (a == 3) {
				continue;
			}
			System.out.println(i);
		}

		// ⚙️ 8. Infinite Loops
		// Java - for(;;) {} or while(true) {}
		// C++ - for(;;) or while(true)
		// Python - while True:
		// Use break carefully to avoid accidental infinite execution.

		// ⚙️ 9. Advanced Loop Concepts
		// Labelled Loops (Java) – control outer loops from inner blocks.

		outer: for (int x = 1; x <= 3; x++) {
			for (int y = 1; y <= 3; y++) {
				if (x == 2 && y == 2) {
					break outer;
				}
				System.out.println(x + " " + y);
			}
		}
		/*
		 * Iterators (Java Collections) – you’ll revisit them soon.
		 * 
		 * Range-based Iteration (C++11+) works on any container with begin() and end().
		 */

		// 10. Java – Iterators, Iterable, Streams
		List<Integer> list = List.of(10, 20, 30);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Enhanced For Loop = Iterator sugar
		for (int x : list) {
			System.out.println(x);
		}

		// Java Streams (the modern superpower)
		// Example: filtering + mapping + consuming
		List<Integer> nums = List.of(1, 2, 3, 4, 5);

		nums.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);
		
		/*
		 * Why streams matter?
		 * 
		 * Lazy evaluation, Parallel processing, No indexing → pure functional flow, No
		 * accidental infinite loops
		 * 
		 * Streams transform looping from a manual crank to a flowing river.
		 */
	}
}