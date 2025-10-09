package com.Frankly.FunctionalProgramming;

import java.util.List;

public class MethodReferenceRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

//		Method Reference
//		function(ClassName::methodName)
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);
	
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferenceRunner::print);


		Integer max = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);

//		Method Reference
		Integer maxWithMethodReference = List.of(23, 45, 67, 34).stream().filter(MethodReferenceRunner::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println(maxWithMethodReference);

	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
