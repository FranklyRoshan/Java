/*
Question: "Sum of Digits of a Number"

Description:
Write a program that takes an integer input and returns the sum of its digits.

Example:

Input: 472
Output: 13  // (4 + 7 + 2 = 13)
 */
package programs;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = scanner.nextInt();

		int sum = 0;

		while (n != 0) {
			int digit = n % 10; // Get the last digit
			sum += digit;		// Add it to the sum
			n = n /10;			// Remove the last digit
		}

		System.out.println("Sum of digits: " + sum);
		scanner.close();
	}

}
