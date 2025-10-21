package com.example.java;

public class SimpleArray {

	public static void main(String[] args) {

		System.out.println("Arrays of Primitives.");
		int[] ints = { 1, 2, 3, 4, 5 }; // int ints[] = {1, 2, 3, 4, 5}
		// length is a property, Not a method. So, No need for Parenthesis "()"
		for (int j : ints) {
			System.out.println(j);
		}

		System.out.println("\nArrays of Strings.");
		String[] colors = { "Red", "Green", "Blue" };
		for (String color : colors) {
			System.out.println(color);
		}

		System.out.println("\nSetting Array size intially.");
		int[] sized = new int[10];
		for (int i = 0; i < sized.length; i++) {
			sized[i] = i * 100;
		}

		for (int size : sized) {
			System.out.println(size);
		}

		System.out.println("\nCopying an Array.");
		int[] copied = new int[5];
		// System.arraycopy(sourceArray, startingIndex, destinationArray,
		// destinationPosition, arrayLength);
		System.arraycopy(sized, 5, copied, 0, 5);
		for (int value : copied) {
			System.out.println(value);
		}
	}

}
