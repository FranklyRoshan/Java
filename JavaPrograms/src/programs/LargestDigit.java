/*
 Question: Find the Largest Digit in a Number

Problem Statement:
Write a Java program to find the largest digit in a given positive integer.


---

Example 1:

Input:

5382

Output:

Largest digit: 8


---

Example 2:

Input:

1904

Output:

Largest digit: 9


---

Constraints:

Only positive integers.

No need to convert to string unless you want to.

You can use % and / to extract digits.
 */
package programs;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number with more one digit: ");
		int number = scanner.nextInt();

		int largest = 0;

		while (number > 0) {
			int digit = number % 10; // Get the last digit
			if (digit > largest) {
				largest = digit;
			}

			number = number/10; // Remove the last digit
		}

		System.out.println("Largest digit: " + largest);
		scanner.close();
	}

}


// Advanced
/*
import java.util.Scanner;
// import java.util.Stream.*;

public class LargestDigit {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number with more one digit: ");
		int number = scanner.nextInt();

		int maxDigit = String.valueOf(number)
						.chars()
						.map(Character::getNumericValue)
				      	.max()
				  	    .getAsInt();

		System.out.println("Largest digit: " + maxDigit);
		scanner.close();
	}
}
*/
