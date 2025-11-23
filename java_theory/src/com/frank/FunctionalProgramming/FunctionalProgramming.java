package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

// Functional Programming (Using Streams)
// Uses stream() and reduce() to compute the sum in a single line.

public class FunctionalProgramming {

	public static void main(String[] args) {
		// Create a concrete List object to pass to the method
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		// Call the static method correctly, passing the list object
		System.out.println("Functional Sum: " + addListFunctional(numbers));
		// Expected Output: 10 + 20 + 30 + 40 = 100

	}

	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream().reduce(0, Integer::sum);
	}

}
