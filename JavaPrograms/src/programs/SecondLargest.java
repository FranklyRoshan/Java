/*
 Question: "Second Largest Element in an Array"

Description:
Write a Java program that:

Takes n integers from the user and stores them in an array.

Finds and prints the second largest element in the array.


Example 1:
Input: 5 8 3 9 2
Output: Second largest: 8

Example 2:
Input: 10 10 10
Output: No second largest element


---

This question helps you practice:

Arrays

Conditions and comparisons

Edge case handling
 */
package programs;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input size of array
		System.out.println("Enter the number of elements in  the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		// Input array elements
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Finding the second largest element
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest; // Update second largest
				largest = arr[i]; // Update largest
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i]; // Update second largest
			}
		}

		// If second largest doesn't exist
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element.");
		} else {
			System.out.println("The second largest element is: " + secondLargest);
		}

		scanner.close();
	}

}
