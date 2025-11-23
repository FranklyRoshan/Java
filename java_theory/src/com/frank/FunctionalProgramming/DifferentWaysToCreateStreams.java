package com.frank.FunctionalProgramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWaysToCreateStreams {

	// Helper method to create a dummy file for demonstration of Files.lines()
	private static void setupDummyFile(String fileName) {
		try {
			Files.writeString(Paths.get(fileName),
					"Line 1: Files.lines example\n" + "Line 2: Streams simplify IO operations");
		} catch (IOException e) {
			System.err.println("Warning: Could not create dummy file for Files.lines demo.");
		}
	}

	public static void main(String[] args) {

		System.out.println("--- Different Ways to Create Streams in Java ---\n");

		// --- 1. From Collections (Lists and Maps) ---
		System.out.println("1. From Collections:");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		System.out.print("   List Stream: ");
		numbers.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();

		Map<String, Integer> courses = Map.of("Java", 100, "Python", 80);

		System.out.print("   Map Key Stream: ");
		courses.keySet().stream().forEach(k -> System.out.print(k + " "));
		System.out.println();

		System.out.print("   Map Value Stream: ");
		courses.values().stream().forEach(v -> System.out.print(v + " "));
		System.out.println("\n");

		// --- 2. Using Stream.of() ---
		System.out.println("2. Using Stream.of():");
		Stream<String> streamOfValues = Stream.of("Apple", "Banana", "Cherry");
		System.out.print("   Stream.of: ");
		streamOfValues.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");

		// --- 3. Using Arrays.stream() ---
		System.out.println("3. Using Arrays.stream() (IntStream):");
		int[] primitiveNumbers = { 10, 20, 30, 40, 50 };
		IntStream intStream = Arrays.stream(primitiveNumbers);
		System.out.print("   Arrays.stream: ");
		intStream.forEach(n -> System.out.print(n + " "));
		System.out.println("\n");

		// --- 4. Using Stream.builder() ---
		System.out.println("4. Using Stream.builder():");
		Stream.Builder<String> builder = Stream.builder();
		builder.add("Java").add("Python").add("JavaScript");
		Stream<String> builtStream = builder.build();
		System.out.print("   Stream.builder: ");
		builtStream.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");

		// --- 5. Using Stream.generate() (Infinite Stream) ---
		System.out.println("5. Using Stream.generate() (5 Random Doubles):");
		Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
		System.out.print("   Stream.generate: ");
		randomNumbers.forEach(r -> System.out.printf("%.2f ", r)); // Format to 2 decimal places
		System.out.println("\n");

		// --- 6. Using Stream.iterate() (Infinite Stream) ---
		System.out.println("6. Using Stream.iterate() (5 Even Numbers):");
		Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(5);
		System.out.print("   Stream.iterate: ");
		evenNumbers.forEach(n -> System.out.print(n + " ")); // Output: 0 2 4 6 8
		System.out.println("\n");

		// --- 7. Using Files (Files.lines()) ---
		System.out.println("7. Using Files.lines():");
		final String DUMMY_FILE = "dummy_stream_file.txt";
		setupDummyFile(DUMMY_FILE); // Create the file
		try (Stream<String> fileStream = Files.lines(Paths.get(DUMMY_FILE))) {
			System.out.print("   Files.lines output:\n");
			fileStream.forEach(line -> System.out.println("   -> " + line));
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
		System.out.println();

		// --- 8. Using IntStream.range() ---
		System.out.println("8. Using IntStream.range() / rangeClosed():");
		System.out.print("   IntStream.range(1, 5) [1, 4]: ");
		IntStream.range(1, 5).forEach(System.out::print); // Output: 1234
		System.out.println();

		System.out.print("   IntStream.rangeClosed(1, 5) [1, 5]: ");
		IntStream.rangeClosed(1, 5).forEach(System.out::print); // Output: 12345
		System.out.println();
	}
}