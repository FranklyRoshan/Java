package com.frank.CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheBestPracticesWithLoops {

	// Define a static method for demonstration purposes
	// (used in the 'process' examples)
	private static void process(String item) {
		// In a real application, this would contain processing logic
		System.out.println("Processing: " + item);
	}

	public static void main(String[] args) {

		// --- DEFINE NECESSARY VARIABLES ---
		List<String> list = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma"));
		List<String> words = Arrays.asList("Hello", " ", "World");
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		int target = 30;

		System.out.println("What Are the Best Practices with Loops? #");
		System.out.println("------------------------------------------");

		// ✅ Use Enhanced for Loop or Functional Programming for Collections (Faster &
		// Readable)
		System.out.println("1. Enhanced Loop (Faster & Readable):");
		for (String item : list) {
			System.out.println(item);
		}

		// ✅ ALTERNATIVE: Functional Programming
		System.out.println("1. Functional Programming (forEach):");
		list.forEach(System.out::println);

		// ✅ Avoid Expensive Operations Inside Loops
		System.out.println("\n2. Efficient Loop (Pre-calculating size):");
		// Store size in a variable (Fixed: removed redeclaration)
		int size = list.size();
		for (int i = 0; i < size; i++) {
			process(list.get(i)); // Calls the defined static process method
		}

		// ✅ ALTERNATIVE: Functional Programming
		System.out.println("2. Functional Programming (Process):");
		list.forEach(TheBestPracticesWithLoops::process);

		// ✅ Use StringBuilder Instead of String for Concatenation
		// ❌ Inefficient: Creates new String objects in each iteration
		String inefficientResult = "";
		for (String word : words) {
			inefficientResult += word;
		}
		System.out.println("\n3. Inefficient Concatenation Result: " + inefficientResult);

		// ✅ Efficient: Uses a single `StringBuilder` object
		StringBuilder efficientResultBuilder = new StringBuilder(); // Fixed: Use a unique variable name
		for (String word : words) {
			efficientResultBuilder.append(word);
		}
		String efficientResult = efficientResultBuilder.toString();
		System.out.println("3. Efficient Concatenation Result: " + efficientResult);

		// ✅ Use break and continue Wisely
		System.out.println("\n4. Using break Wisely (Target: " + target + ")");

		// ✅ Efficient: Stops loop once found
		for (int num : numbers) {
			if (num == target) {
				System.out.println("Found " + target + "! Stopping loop.");
				break; // Exits loop early
			}
			System.out.println("Checking: " + num);
		}

		// ✅ Use Parallel Streams for Large Data Sets (Java 8+)
		System.out.println("\n5. Parallel Stream Processing:");
		// The order of output is not guaranteed with parallel streams
		list.parallelStream().forEach(item -> System.out.println("Parallel: " + item));

		// ✅ Choose the Right Loop Type (Demonstration skipped, as this is a table of
		// best practices)

		/*
		 * Scenario - Best Loop Type
		 * 
		 * Fixed number of iterations - for loop
		 * 
		 * Loop until condition is met - while loop
		 * 
		 * Iterating over a collection - Enhanced for loop
		 * 
		 * Processing large datasets - parallelStream()
		 * 
		 */

	}

}