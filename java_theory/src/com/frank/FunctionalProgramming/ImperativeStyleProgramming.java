package com.frank.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

/* 
 * What is Imperative Style?
 * Uses step-by-step logic to solve a problem.
 * Focuses on how to achieve the result.
 * 
 * What is Functional Programming?
 * Uses declarative code instead of loops.
 * Focuses on what needs to be done, not how.
 */

// Example 1: Imperative Code (Using Loops)
// Explicitly loops through the list and keeps a running sum.
public class ImperativeStyleProgramming {

	public static void main(String[] args) {
		// Create a concrete List object to pass to the method
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		// Call the static method correctly, passing the list object
		System.out.println("Imperative Sum: " + addListImperative(numbers));
		// Expected Output: 10 + 20 + 30 + 40 = 100
	}

	private static int addListImperative(List<Integer> numbers) {
		int sum = 0; // 👈 State (sum) is MUTABLE
		for (int number : numbers) { // 👈 Explicit Loop (HOW)
			sum += number; // 👈 Modifying the state
		}
		return sum;
	}

}

/*
 * 
 * Feature - Imperative Style - Functional Programming
 * 
 * Style - Step-by-step logic - Declarative (focus on what, not how)
 * 
 * Looping - Uses for/while loops - Uses Streams
 * 
 * State Management - Uses mutable variables (sum) - Avoids mutation
 * 
 * Code Readability - More verbose - More concise & readable
 * 
 */