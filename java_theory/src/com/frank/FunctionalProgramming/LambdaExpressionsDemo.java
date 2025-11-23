package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		// Data sources for stream operations
		List<Integer> numbers = Arrays.asList(10, 15, 22, 35, 40, 51);
		List<String> courses = Arrays.asList("Java", "Spring", "AWS", "Python", "Docker");

		System.out.println("--- Lambda Expressions Demo ---");

		// 1. Filtering Even Numbers Using Lambda
		// Lambda used as a Predicate (Input -> Boolean): (number -> number % 2 == 0)
		System.out.println("\n1. Filtering Even Numbers:");
		System.out.print("   Even Only: ");
		numbers.stream()
				// The lambda function defines the filtering logic concisely
				.filter(number -> number % 2 == 0).forEach(System.out::println);

		// 2. Mapping Course Names to Uppercase
		// Lambda used as a Function (Input -> Output): (course -> course.toUpperCase())
		System.out.println("\n2. Mapping Course Names to Uppercase:");

		courses.stream()
				// The lambda function defines the transformation logic
				.map(course -> course.toUpperCase()).forEach(System.out::println);

		// 3. Sorting Courses by Length of Name
		// Lambda used as a Comparator (Input1, Input2 -> Integer): (c1, c2) ->
		// c1.length() - c2.length()
		System.out.println("\n3. Sorting Courses by Length (Shortest to Longest):");

		courses.stream()
				// The lambda replaces the anonymous inner class for Comparator
				.sorted((c1, c2) -> c1.length() - c2.length()).forEach(System.out::println);

		// 4. Using UnaryOperator to Triple a Number
		System.out.println("\n4. Using Functional Interface (UnaryOperator):");

		// UnaryOperator<Integer> is a functional interface (T -> T)
		// The lambda (x -> x * 3) provides the implementation for the apply method
		UnaryOperator<Integer> triple = x -> x * 3;

		System.out.println("   Input (10) tripled: " + triple.apply(10)); // Output: 30
	}
}