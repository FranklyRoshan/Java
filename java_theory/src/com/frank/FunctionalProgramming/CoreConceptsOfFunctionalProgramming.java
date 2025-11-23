package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class CoreConceptsOfFunctionalProgramming {

	public static void main(String[] args) {

		// Define the list of strings (courses)
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker");

		System.out.println("Original courses list: " + courses);
		System.out.println("\nCourses in UPPERCASE:");

		// Functional Programming Stream Operations:
		courses.stream()
				// 1. map(): Transforms each element (e.g., "Spring" -> "SPRING")
				.map(course -> course.toUpperCase())

				// 2. forEach(): Terminal operation to print each transformed element
				.forEach(System.out::println);
	}
}

/*
 * Stream
 * 
 * What? A sequence of elements that supports functional-style operations.
 * 
 * Why? Allows processing of data in a declarative and efficient way.
 * 
 * Example: courses.stream() creates a stream from the list of courses. This
 * stream enables pipeline processing without modifying the original list.
 * 
 * 
 * 2. Lambda Function What? An anonymous function that represents a short piece
 * of code.
 * 
 * Why? Makes code concise and readable.
 * 
 * Example: course -> course.toUpperCase() is a lambda function that converts
 * each course name to uppercase. It eliminates the need for writing a separate
 * method.
 * 
 * 
 * 3. Method Reference
 * 
 * What? A shorthand for calling a method using ClassName::methodName or
 * object::methodName.
 * 
 * Why? Further simplifies lambda expressions when an existing method can be
 * used directly.
 * 
 * Example: System.out::println is a method reference that replaces x ->
 * System.out.println(x).
 * 
 */
