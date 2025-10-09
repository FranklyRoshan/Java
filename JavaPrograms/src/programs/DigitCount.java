/*
 Question: Count the Number of Digits in a Number

Problem Statement:
Write a Java program to count how many digits are in a given positive integer.


---

Example 1:

Input:

5382

Output:

Number of digits: 4


---

Example 2:

Input:

120045

Output:

Number of digits: 6


---

Constraints:

Don't convert to String unless you want to.

Use division logic to count.
 */

/*
import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int count = 0;

		if(number == 0) {
			count = 1;
		} else {
			while (number > 0) {
				number = number / 10;
				count++;
			}
		}

		System.out.println("Number of digits: " + count);
		scanner.close();
	}

}
*/
package programs;

import java.util.Scanner;

public class DigitCount {
	public static void main(String... args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		String numStr = String.valueOf(number);
		int count = numStr.length();

		System.out.println("Number of digits: " + count);
		scanner.close();
	}
}

