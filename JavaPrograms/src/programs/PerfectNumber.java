/*
Question: Check if a Number is a Perfect Number

Problem Statement:
Write a Java program to check if a number is a perfect number.

A perfect number is a number that is equal to the sum of its proper divisors (excluding itself).
Example: 6 is perfect because 1 + 2 + 3 = 6


---

Example 1:

Input:

6

Output:

6 is a perfect number.

Example 2:

Input:

10

Output:

10 is not a perfect number.
 */
package programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i; // Add divisors
			}
		}

		if (sum == num) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " isn't a perfect number.");
		}

		scanner.close();

	}

}
