package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceDemo {

	// Custom static utility method used in Example 2
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Java", "Spring", "AWS", "Python", "Docker");
		List<Integer> numbers = Arrays.asList(12, 15, 8, 25, 30, 7);

		System.out.println("--- Method References vs. Lambdas ---");

		// ------------------------------------------------------------------
		// 📌 1. Calling a Static Method (ClassName::staticMethod)
		// ------------------------------------------------------------------

		System.out.println("\n1. Static Method Reference Demo (Filtering):");

		// Using Method Reference: Passes each number to the static isEven method
		System.out.print("   Filter (Method Ref): ");
		numbers.stream()
				// Method Reference: ClassName::methodName
				.filter(MethodReferenceDemo::isEven).forEach(System.out::println);

		// Equivalent Lambda Expression: Verbose version
		System.out.print("   Filter (Lambda Eq):  ");
		numbers.stream().filter(number -> MethodReferenceDemo.isEven(number))
				.forEach(number -> System.out.println(number));

		// Example 1: Java Utility Method (System.out::println)
		System.out.println("\n   Java Utility Method:");
		System.out.print("   Method Reference: ");
		courses.stream().forEach(System.out::println);

		// ------------------------------------------------------------------
		// 📌 2. Calling an Instance Method (ClassName::instanceMethod)
		// ------------------------------------------------------------------

		System.out.println("\n2. Instance Method Reference Demo (Transformation):");

		// Using Method Reference: Calls the toUpperCase() instance method on each
		// String element
		System.out.print("   Map (Method Ref): ");
		courses.stream()
				// Method Reference: ClassName::instanceMethod
				.map(String::toUpperCase).forEach(System.out::println);

		// Equivalent Lambda Expression
		System.out.print("   Map (Lambda Eq):  ");
		courses.stream().map(course -> course.toUpperCase()).forEach(System.out::println);

		// ------------------------------------------------------------------
		// 📌 3. When Creating New Objects (Constructor Reference)
		// ------------------------------------------------------------------

		System.out.println("\n3. Constructor Reference Demo (String::new):");

		// Using Constructor Reference: Refers to the default constructor String()
		// Method Reference: ClassName::new
		Supplier<String> stringSupplierRef = String::new;

		// Equivalent Lambda Expression
		Supplier<String> stringSupplierLambda = () -> new String();

		String s1 = stringSupplierRef.get();
		String s2 = stringSupplierLambda.get();

		System.out.println("   String created via Constructor Ref: " + s1.getClass().getName());
		System.out.println("   String created via Lambda: " + s2.getClass().getName());
		System.out.println("   Result: " + (s1 instanceof String));
	}

}