/*
 Question: Check Whether a Number is an Armstrong Number

Problem Statement:
Write a Java program to check if a given number is an Armstrong number.

A number is an Armstrong number if the sum of its digits raised to the power of the number of digits equals the number itself.


---

Example 1:

Input:

153

Output:

153 is an Armstrong number.

Explanation:
1³ + 5³ + 3³ = 1 + 125 + 27 = 153


---

Example 2:

Input:

123

Output:

123 is not an Armstrong number.


---

Note:

Works for any number of digits.

Use Math.pow(digit, numberOfDigits).
 */

/*
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int original =num;
		int count = 0;

		if (num == 0) {
			count = 1;
		} else {
			while (num > 0) {
				num = num / 10;
				count++;
			}
		}

		int ams = 0;

		while (num > 0) {
			int digit = num % 10; // Get the last digit

			ams += Math.pow(digit, count);

			num = num / 10; // Remove the last digit
		}

		if (ams == num) {
			System.out.println(original + " is a Amstrong Number.");
		} else {
			System.out.println(original + " isn't a Amstrong Number.");
		}

		scanner.close();
	}

}
*/
/*
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String... args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int number  = scanner.nextInt();

		int original = number;
		int result = 0;

		int digits = String.valueOf(number).length();

		while(number > 0) {
			int digit = number % 10;
			result += Math.pow(digit, digits);
			number = number / 10;
		}

		if (result == original) {
			System.out.println(original + " is an Armstrong number.");
		} else {
			System.out.println(original + " isn't Armstrong number.");
		}

		scanner.close();
	}
}
*/

/*
 Question: Check if a Number is an Armstrong Number

Problem Statement:
Write a Java program to check if a given number is an Armstrong number.

A number is an Armstrong number if the sum of the cubes of its digits equals the number itself.
(For 3-digit numbers: 153 → 1³ + 5³ + 3³ = 153)


---

Example 1:

Input:

153

Output:

153 is an Armstrong number.

Example 2:

Input:

125

Output:

125 is not an Armstrong number.
*/
package programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num  = scanner.nextInt();
		int original = num;
		int arms = 0;

		int digits = String.valueOf(num).length();
		while (num > 0) {
			int digit  = num % 10;
			arms += Math.pow(digit, digits);
			num /= 10;
		}

		if (arms == original) {
		System.out.println(original + " is an Armstrong number.");
		} else {
			System.out.println(original + " isn't an Armstrong number.");
		}

		scanner.close();
	}
}

