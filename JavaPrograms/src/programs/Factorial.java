/*
Question: Find the Factorial of a Number

Problem Statement:
Write a Java program to find the factorial of a given non-negative integer.

The factorial of n (written as n!) is the product of all positive integers less than or equal to n.


---

Example 1:

Input:

5

Output:

Factorial of 5 is: 120

Example 2:

Input:

0

Output:

Factorial of 0 is: 1
 */
package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();

		long factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + n + " is: " + factorial);
		scanner.close();
	}

}


/*
import java.util.Scanner;

public class Factorial {

	public static long factorial(int n ) {
		if  (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();

		long result = factorial(n);

		System.out.println("Factorial  of " + n +" is: " + result);
		scanner.close();
	}
}
*/
