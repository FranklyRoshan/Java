package com.Frankly.FunctionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

//		int sum = normalSum(numbers);
		int sum = sumWithFunctionalProgramming(numbers);
		System.out.println(sum);

		lambdaExpression(numbers);
	}

	private static int sumWithFunctionalProgramming(List<Integer> numbers) {
		int sum = numbers.stream().filter(number -> number % 2 == 1). // No mutation
				reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number; // Mutation
		}
		return sum;
	}

	private static int lambdaExpression(List<Integer> numbers) {
//		Streams - Intermediate Operation and Terminal Operation

		int sum = numbers.stream().
//				Streams Intermediate Operation
				filter(number -> number % 2 == 1). // No mutation
//				Streams Terminal Operation
//				Lambda Expression ->
				reduce(0, (number1, number2) -> {
					System.out.println(number1 + " " + number2);
					return number1 + number2;
				});
		return sum;
	}

}

