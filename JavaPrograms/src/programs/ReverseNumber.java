/*
 Question: Reverse the Digits of a Number

Problem Statement:
Write a Java program to reverse the digits of a given positive integer.


---

Example 1:

Input:

1234

Output:

Reversed number: 4321


---

Example 2:

Input:

500

Output:

Reversed number: 5


---

Constraints:

Do not use StringBuilder.reverse() for now.

Use % and / operators to extract digits.
 */
package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number more than one digit: ");
		int num = scanner.nextInt();
		int reversed = 0;

		while (num > 0) {
			int digit = num % 10; 				// Extract last digit
			reversed = reversed * 10 + digit;	// Append digit
			num = num / 10;						// Remove last digit
		}

		System.out.println("Reversed number: " + reversed);
		scanner.close();
	}

}


/*
import java.util.Scanner;

public class ReverseNumber {
	public static void  main(String... args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number more than one digit: ");
		int num = scanner.nextInt();

		StringBuilder sb = new StringBuilder(String.valueOf(num));
		sb.reverse();

		int reversed = Integer.parseInt(sb.toString());

		System.out.println("Reversed number: " + reversed);
		scanner.close();
	}
}
*/