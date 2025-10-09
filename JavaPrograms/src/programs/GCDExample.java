/*
 Question: Find the GCD (Greatest Common Divisor) of Two Numbers

Problem Statement:
Write a Java program to find the GCD (also known as HCF – Highest Common Factor) of two positive integers.


---

Example 1:

Input:

a = 36
b = 60

Output:

GCD: 12


---

Constraints:

Use a loop or Euclidean Algorithm (preferred).

Avoid using built-in functions like BigInteger.gcd() for now.
 */
package programs;

import java.util.Scanner;

public class GCDExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int a = scanner.nextInt();

		System.out.print("Enter an another number: ");
		int b = scanner.nextInt();

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		System.out.println("GCD: " + a);
		scanner.close();
	}

}
