package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalConceptsDemo {

	public record Course(String name, String category, int reviewScore, int students) {
	}

	// ----------------------------------------------------------------------
	// EXAMPLE 1: Returning a Function (HIGHER-ORDER FUNCTION)
	// ----------------------------------------------------------------------

	/**
	 * This function returns a Predicate<Course> based on a cutoff value. This is a
	 * Higher-Order Function because it RETURNS a function (the Predicate). It
	 * allows dynamic filtering without hardcoding conditions.
	 */
	public static Predicate<Course> createPredicate(int cutoff) {
		// The returned predicate is then applied to a stream.
		return course -> course.reviewScore() > cutoff;
	}

	// ----------------------------------------------------------------------
	// EXAMPLE 2: Passing a Function (BEHAVIOR PARAMETERIZATION)
	// ----------------------------------------------------------------------

	/**
	 * This method accepts a Predicate<Integer> as an argument, allowing flexible
	 * filtering logic. This achieves Behavior Parameterization, as the 'behavior'
	 * (the filter condition) is passed in.
	 */
	public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {

		System.out.println("\n   --- Filter using: " + predicate.toString() + " ---");

		numbers.stream()
				// The predicate function is the behavior being parameterized
				.filter(predicate).forEach(n -> System.out.print(n + " "));

		System.out.println();
	}

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("AWS", "Cloud", 95, 200000), new Course("Azure", "Cloud", 90, 150000),
				new Course("Spring", "Framework", 97, 220000), new Course("Docker", "Cloud", 85, 180000));
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("--- Functional Programming Concepts Demo ---");

		// FCF (Functions as First-Class Citizens) is the enabling principle here:
		// We can store a function in a variable (highScore or isEven).

		// ----------------------------------------------------------------------
		// Demonstration of HOF (Returning a Function)
		// ----------------------------------------------------------------------
		System.out.println("\n1. Higher-Order Function Demo (Returning a Predicate):");

		// FCF: Store the returned function in a variable
		Predicate<Course> highScore = createPredicate(95); // HOF call returns the Predicate

		System.out.println("   Filtering courses with score > 95:");

		List<Course> filtered = courses.stream()
				// FCF: Pass the function (highScore) as an argument
				.filter(highScore).collect(Collectors.toList());

		filtered.forEach(c -> System.out.println("   -> " + c.name()));

		// ----------------------------------------------------------------------
		// Demonstration of BP (Passing a Function)
		// ----------------------------------------------------------------------
		System.out.println("\n2. Behavior Parameterization Demo (Passing Filters):");
		System.out.println("   Original Numbers: " + numbers);

		// BP: Passing the 'even' behavior
		filterAndPrint(numbers, x -> x % 2 == 0);

		// BP: Passing the 'odd' behavior
		filterAndPrint(numbers, x -> x % 2 != 0);

		// BP: Passing the 'multiple of 3' behavior
		filterAndPrint(numbers, x -> x % 3 == 0);

	}
}