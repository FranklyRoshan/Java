package com.example.java;

public class PassingArgumentsByReferenceOrByValue {

	public static void incrementValue(int inMethod) {
		inMethod++;
		System.out.println("In Method: " + inMethod);
	}

	public static void incrementValue(int[] inMethod) {
		inMethod[0]++;
		System.out.println("In Method: " + inMethod[0]);
	}

	public static void changeString(String inMethod) {
		inMethod = "New!";
		System.out.println("In Method: " + inMethod);
	}

	public static void main(String[] args) {

		// Passing Values to Methods

		System.out.println("Passing to a method by copy.");
		// The method receives a copy of the variable.
		int original = 10;
		System.out.println("Original Value Before: " + original);
		incrementValue(original);
		System.out.println("Original Value After: " + original);

		System.out.println("\nPassing to a method by reference.");
		// The method receives a reference to the original object.
		int[] arOriginal = { 10, 20, 30 };
		System.out.println("Original Value Before: " + arOriginal[0]);
		incrementValue(arOriginal);
		System.out.println("Original Value After: " + arOriginal[0]);

		// In Java, variables are always passed by copy!!!
		/*
		 * Object Variables Are References. A reference variable points to a location in
		 * memory. When a variable is passed to a function, a new reference is always
		 * created. Both references point to the original objects or values.
		 */

		System.out.println("\nPassing String Values.");
		String strOriginal = "Original!";
		System.out.println("Original String Before: " + strOriginal);
		changeString(strOriginal);
		System.out.println("Original String After: " + strOriginal);
	}

}
