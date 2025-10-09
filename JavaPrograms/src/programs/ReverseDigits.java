/*
 Question: Reverse the Digits of an Integer

Problem Statement:
Write a Java program to reverse the digits of a given integer.


---

Example 1:

Input:

Input: 1234

Output:

Reversed: 4321


---

Example 2:

Input:

Input: -789

Output:

Reversed: -987


---

Note:

Avoid converting to String or using StringBuilder this time.

Try solving it using arithmetic (modulus and division).
 */
package programs;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int reversed = 0;
		int original = num;
		int sign = num < 0  ? -1 : 1;
		num = Math.abs(num);

		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		reversed *= sign;

		System.out.println("The reversed number of " + original + " is: " + reversed);
		scanner.close();
	}

}
