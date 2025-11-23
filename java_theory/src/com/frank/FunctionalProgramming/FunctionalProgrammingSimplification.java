package com.frank.FunctionalProgramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingSimplification {

	public static void main(String[] args) {

		System.out.println("--- Functional Programming Simplifies Java Code ---");

		// ----------------------------------------------------------------------
		// 1. Creating a Thread (Using the Runnable functional interface)
		// ----------------------------------------------------------------------
		System.out.println("\n1. Creating a Thread:");

		// // ❌ Traditional way (Verbose Anonymous Inner Class)
		// Thread thread1 = new Thread(new Runnable() {
		// @Override
		// public void run() {
		// System.out.println(" [Traditional] Thread running...");
		// }
		// });
		// thread1.start();

		// ✅ Functional way (Lambda Expression): Shorter and more readable.
		Thread thread2 = new Thread(() -> System.out.println("   [Functional] Thread running..."));

		thread2.start();

		// ----------------------------------------------------------------------
		// 2. Creating a Comparator (Using the Comparator functional interface)
		// ----------------------------------------------------------------------
		System.out.println("\n2. Creating a Comparator:");
		List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob")); // Must be mutable for sort()

		// // ❌ Traditional way (Verbose Anonymous Inner Class for Comparator)
		// Collections.sort(names, new Comparator<String>() {
		// @Override
		// public int compare(String s1, String s2) {
		// return s1.compareTo(s2);
		// }
		// });
		// System.out.println(" [Traditional] Sorted: " + names);

		// Reset list for functional demo
		List<String> namesFp = new ArrayList<>(Arrays.asList("John", "Alice", "Bob"));

		// ✅ Functional way (Lambda): Uses a lambda function, reducing code complexity.
		// The list's sort method accepts the lambda as the Comparator implementation.
		namesFp.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println("   [Functional] Sorted: " + namesFp);

		// ----------------------------------------------------------------------
		// 3. Listing Files in a Directory (Using the Stream API)
		// ----------------------------------------------------------------------
		System.out.println("\n3. Listing Files in a Directory:");

		// NOTE: Path creation requires exception handling (or main declaration)
		Path path = Paths.get("./src/com/frank/CoreJava");

		// // ❌ Traditional way (Uses File API and a for-loop)
		// try {
		// File[] files = new File(".").listFiles();
		// System.out.println(" [Traditional] Files in directory:");
		// if (files != null) {
		// for (File file : files) {
		// System.out.println(" -> " + file.getName());
		// }
		// }
		// } catch (Exception e) {
		// // Handle potential security or IO errors
		// System.out.println(" [Traditional] Error listing files: " + e.getMessage());
		// }

		// ✅ Functional way (Streams): Uses Files.list() with method reference.
		// Declarative pipeline.
		try {
			System.out.println("   [Functional] Files in directory:");
			// Files.list returns a Stream<Path>, method reference System.out::println acts
			// as Consumer
			Files.list(Paths.get(".")).forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("   [Functional] Error listing files: Directory not found or IO error.");
		}

		// ----------------------------------------------------------------------
		// 4. Filtering & Transforming a List (Using Stream API operations)
		// ----------------------------------------------------------------------
		System.out.println("\n4. Filtering & Transforming a List:");
		List<String> words = Arrays.asList("apple", "banana", "cherry", "dragonfruit");
		System.out.println("   Original Words: " + words);

		// // ❌ Traditional way (Uses loops, mutates a new list)
		// List<String> ucWords = new ArrayList<>();
		// for (String word : words) {
		// // Explicit conditional check
		// if (word.length() > 5) {
		// // Explicit mutation/addition
		// ucWords.add(word.toUpperCase());
		// }
		// }
		// System.out.println(" [Traditional] Result: " + ucWords);

		// ✅ Functional way (Streams): Uses filter(), map(), and toList(). Declarative.
		List<String> ucWordsFp = words.stream()
				// filter(): Keeps elements that satisfy the Predicate (word.length() > 5)
				.filter(word -> word.length() > 5)
				// map(): Transforms elements using the Function (String::toUpperCase)
				.map(String::toUpperCase)
				// toList(): Terminal operation collects the result
				.toList();

		System.out.println("   [Functional] Result: " + ucWordsFp);
	}
}