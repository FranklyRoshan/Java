/*
Exercism-style Question #11:

Problem: Check if a number is Prime

Write a Java program that:

Takes an integer as input.

Checks and prints whether the number is Prime or Not Prime.
(A prime number is a number greater than 1 that has no divisors other than 1 and itself.)


Example:

Input:
Enter a number: 7

Output:
7 is a Prime number.

Input:
Enter a number: 9

Output:
9 is Not a Prime number.
 */
package programs;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if(isPrime(num)) {
			System.out.println(num + " is a Prime number.");
		} else {
			System.out.println(num + " is Not a Prime number.");
		}

		scanner.close();
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
