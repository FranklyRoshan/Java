/*
HackerRank-style Question #4:

Problem: Sum of Positive Integers

Write a function that takes an array of integers and returns the sum of all positive numbers in the array.

Example:

Input: [-2, 4, -1, 6, -3, 5]
Output: 15
// (Because 4 + 6 + 5 = 15)
*/
package programs;

import java.util.Scanner;

public class SumOfPositive {
	public static int sumPositive(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if (num > 0) {
			sum += num;
			}
		}

	return sum;
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = sumPositive(arr);
		System.out.println("Sum of positive numbers: " + result);

		scanner.close();
	}
}