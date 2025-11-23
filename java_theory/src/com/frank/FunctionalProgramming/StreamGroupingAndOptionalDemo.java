package com.frank.FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamGroupingAndOptionalDemo {

	// Record definition for immutable data
	public record Course(String name, String category, int reviewScore, int students) {
	}

	// Method to simulate fetching data, used for Optional demo
	private static String getValueFromDatabase() {
		// In a real application, this might return null if no data is found
		return Math.random() > 0.5 ? "Data Found" : null;
	}

	public static void main(String[] args) {

		/*
		 * When Do You Use Collectors.groupingBy? # What? Groups elements of a stream
		 * into a Map based on a key. Why? Simplifies grouping, counting, and
		 * aggregating data in Java Streams.
		 */

		List<Course> courses = List.of(new Course("AWS", "Cloud", 95, 200000), new Course("Azure", "Cloud", 90, 150000),
				new Course("Docker", "Cloud", 85, 180000), new Course("Kubernetes", "Cloud", 88, 170000),
				new Course("Spring", "Framework", 97, 220000), new Course("Spring Boot", "Framework", 93, 210000),
				new Course("Microservices", "Microservices", 98, 250000),
				new Course("FullStack", "FullStack", 96, 230000));

		System.out.println("--- 1. Collectors.groupingBy Examples ---\n");

		// 1. Group Courses by Category
		// Purpose: Standard grouping, results in Map<Key, List<Element>>
		Map<String, List<Course>> coursesByCategory = courses.stream().collect(Collectors.groupingBy(Course::category));

		System.out.println("1. Group Courses by Category:");
		System.out.println(coursesByCategory);

		// 2. Count Courses in Each Category
		// Purpose: Uses downstream collector (counting) to aggregate the List<Course>
		// into a Long count.
		Map<String, Long> courseCountByCategory = courses.stream()
				.collect(Collectors.groupingBy(Course::category, Collectors.counting()));

		System.out.println("\n2. Count Courses in Each Category:");
		System.out.println(courseCountByCategory);

		// 3. Find Highest Rated Course in Each Category
		// Purpose: Uses downstream collector (maxBy) to find the element with the
		// highest score.
		// NOTE: maxBy always returns an Optional because the list for a category might
		// be empty.
		Map<String, Optional<Course>> highestRatedCourseByCategory = courses.stream().collect(
				Collectors.groupingBy(Course::category, Collectors.maxBy(Comparator.comparing(Course::reviewScore))));

		System.out.println("\n3. Find Highest Rated Course in Each Category (Returns Optional):");
		System.out.println(highestRatedCourseByCategory);

		// 4. Get List of Course Names per Category
		// Purpose: Uses mapping to transform elements *after* grouping, creating a
		// List<String> instead of List<Course>.
		Map<String, List<String>> courseNamesByCategory = courses.stream().collect(
				Collectors.groupingBy(Course::category, Collectors.mapping(Course::name, Collectors.toList())));

		System.out.println("\n4. Get List of Course Names per Category (Uses mapping):");
		System.out.println(courseNamesByCategory);

		// Handle missing values

		/*
		 * How does the Optional class help handle missing values?
		 * 
		 * # What? A container that may or may not hold a value.
		 * 
		 * Why? Avoids NullPointerException by explicitly handling missing values.
		 */

		System.out.println("\n--- 2. Optional Class Demo ---\n");

		Optional<String> optional = Optional.ofNullable(getValueFromDatabase());

		System.out.println("Result of getValueFromDatabase() (may be null or value): " + optional);

		// isPresent() / ifPresent(Consumer)
		if (optional.isPresent()) {
			System.out.println("   isPresent() is true. Value: " + optional.get());
		} else {
			System.out.println("   isPresent() is false. Value is missing.");
		}

		// orElse(defaultValue)
		String valueOrDefault = optional.orElse("Default Value Used");
		System.out.println("   orElse(\"Default Value Used\"): " + valueOrDefault);

		// orElseGet(Supplier)
		Supplier<String> supplier = () -> {
			System.out.print("   orElseGet() called supplier. ");
			return "Generated Value";
		};
		String valueOrGenerated = optional.orElseGet(supplier);
		System.out.println("Value: " + valueOrGenerated);

		// orElseThrow() (Demonstrate with an explicitly empty Optional)
		Optional<String> emptyOpt = Optional.empty();
		System.out.print("   orElseThrow(): ");
		try {
			emptyOpt.orElseThrow(() -> new RuntimeException("No Value Present!"));
		} catch (RuntimeException e) {
			System.out.println("Caught Expected Exception: " + e.getMessage());
		}
	}
}

/*
 * 
 * Method - Purpose - Example Usage
 * 
 * Optional.of(value) - Creates an Optional with a non-null value -
 * Optional.of("Hello")
 * 
 * Optional.ofNullable(value) - Creates an Optional (null safe) -
 * Optional.ofNullable("Hello")
 * 
 * Optional.empty() - Creates an empty Optional - Optional.empty()
 * 
 * isPresent() - Checks if a value is present - opt.isPresent()
 * 
 * ifPresent(Consumer) - Executes code if value exists -
 * opt.ifPresent(System.out::println)
 * 
 * orElse(defaultValue) - Returns value or default if empty -
 * opt.orElse("Default")
 * 
 * orElseGet(Supplier) - Returns value or calls supplier function -
 * opt.orElseGet(() -> "Generated")
 * 
 * orElseThrow() - Throws an exception if value is missing - opt.orElseThrow(()
 * -> new RuntimeException("No Value"))
 * 
 * 
 */