/*
InterviewBit-style Question #8:

Problem: Find the Missing Number

You are given an array containing n distinct numbers taken from the range 1 to n+1.
This means exactly one number is missing.

Write a program to find that missing number.

Example:
Input: [1, 2, 4, 5, 6]
Output: 3
(The number 3 is missing from 1 to 6)
*/
package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingNumberFinder {
	public static void  main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int n = scanner.nextInt();

		List<Integer> numbers = new ArrayList<>();
		int sum = 0;

		System.out.print("Enter " + n + " numbers (from 1 to " + (n + 1) + ", one missing): ");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			numbers.add(num);
			sum += num;
		}

		int expectedSum = (n + 1) * (n + 2) / 2;
		int missing = expectedSum - sum;

		System.out.println("The missing number is: " + missing);

		scanner.close();
	}
}


/*
import java.util.*;

public class MissingNumberFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int [] arr = new int[n];
		int sum = 0;

		System.out.print("Enter " + n + " numbers (from 1 to " + (n + 1) + ", One missing): " );
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}

		int expectedSum = (n + 1) * (n + 2) / 2;
		int missing = expectedSum - sum;
		System.out.println("The missing number is: " + missing);

		scanner.close();
	}
}
*/