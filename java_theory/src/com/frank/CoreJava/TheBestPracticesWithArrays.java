package com.frank.CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheBestPracticesWithArrays {

	public static void main(String[] args) {

		System.out.println("What Are the Best Practices with Using Arrays? #\n");

		// --- DEFINE NECESSARY VARIABLES ---
		int[] myArray = { 10, 20, 30 };
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		int[] original = { 1, 2, 3, 4, 5 };

		String[] array = { "A", "B", "C" };

		int[] src = { 1, 2, 3 };
		int[] dest = new int[3]; // destination array must be initialized

		// ✅ Use Arrays.toString() to Print Arrays
		System.out.println("1. Arrays.toString():");

		// ❌ Prints something like [I@1b6d3586 (memory address)
		System.out.println("Inefficient print: " + myArray);

		// ✅ Prints: [10, 20, 30]
		System.out.println("Efficient print: " + Arrays.toString(myArray));

		// --- Using deepToString for 2D, 3D Arrays ---
		// 2D array (array inside array)
		System.out.println("\n2. Arrays.deepToString() for 2D Arrays:");
		String[][] names = { { "Frank", "Roshan" }, { "Java", "Spring" } };
		// Normal toString() -> prints memory addresses
		System.out.println("Using toString() on 2D: " + Arrays.toString(names));

		// deepToString() -> prints actual nested elements
		System.out.println("Using deepToString(): " + Arrays.deepToString(names));

		// 3D array example
		int[][][] numbers = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		System.out.println("\n3D Array using deepToString(): " + Arrays.deepToString(numbers));

		// ✅ Use Enhanced for Loop or Functional Programming
		System.out.println("\n3. Enhanced Loop & Functional Programming:");
		System.out.println("Enhanced for Loop:");
		for (int num : myArray) {
			System.out.println(num);
		}

		System.out.println("Functional Programming (Streams):");
		Arrays.stream(myArray).forEach(System.out::println);

		// ✅ Use Arrays.equals() to Compare Arrays
		System.out.println("\n4. Arrays.equals():");
		if (Arrays.equals(array1, array2)) {
			System.out.println("Arrays array1 and array2 are equal in content.");
		}

		// ❌ Comparing arrays using == checks only memory references
		if (array1 == array2) {
			System.out.println("Memory references are the same."); // This will likely NOT execute
		} else {
			System.out.println("Memory references are different.");
		}

		// ✅ Use Arrays.deepEquals() for Multidimensional Arrays
		String[][] namesCopy = { { "Frank", "Roshan" }, { "Java", "Spring" } };
		System.out.println("\n5. Arrays.deepEquals():");
		if (Arrays.deepEquals(names, namesCopy)) {
			System.out.println("2D Arrays are equal in content.");
		}

		// ✅ Use Arrays.copyOf() for Cloning
		System.out.println("\n6. Arrays.copyOf() for Cloning and Resizing:");

		int[] copy = Arrays.copyOf(original, original.length);
		System.out.println("Full copy: " + Arrays.toString(copy));

		int[] partialCopy = Arrays.copyOf(original, 3);
		System.out.println("Partial copy (3 elements): " + Arrays.toString(partialCopy));

		int[] expanded = Arrays.copyOf(original, 7);
		System.out.println("Expanded copy (7 elements with padding): " + Arrays.toString(expanded));


		// ✅ Use System.arraycopy() for Fast Copying
		System.out.println("\n7. System.arraycopy() for Fast Copying:");

		// dest is an existing array
		// Copies all elements from src (starting at index 0) to dest (starting at index
		// 0)
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println("Fast copy result: " + Arrays.toString(dest));

		// ✅ Use List Instead of Arrays When Possible
		System.out.println("\n8. Use List Instead of Arrays:");
		// Allows Adding/Removing Elements
		List<String> list = new ArrayList<>(Arrays.asList(array));
		list.add("D");
		System.out.println("List is dynamic: " + list);

		// ✅ Use Streams for Advanced Array Operations
		System.out.println("\n9. Streams for Advanced Array Operations:");
		int sum = Arrays.stream(myArray).sum();
		System.out.println("Sum of myArray (10, 20, 30): " + sum);

		/*
		 * Advantages
		 * 
		 * Less Code: Reduces redundancy in variable declarations.
		 * 
		 * Improves Readability: Focus on logic, not type details.
		 * 
		 * Flexible: Works with generics, loops, and complex types.
		 * 
		 * Compiler Safety: Still enforces strong typing at compile-time.
		 */
	}
}