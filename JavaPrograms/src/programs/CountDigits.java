/*
 Question: Count the Number of Digits in an Integer

Problem Statement:
Write a Java program to count how many digits are in a given integer.


---

Example 1:

Input:

4562

Output:

Number of digits: 4


---

Example 2:

Input:

9

Output:

Number of digits: 1


---

Note:
Try using a loop instead of converting to a string for now.
 */
package programs;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int count = 0;
		int temp = Math.abs(num);

		if (temp ==  0) {
			count = 1;
		} else {
			while (temp > 0) {
				temp /= 10;
				count++;
			}

		}

		System.out.println("Number of digits in an Integer is: " + count);
		scanner.close();
	}

}
