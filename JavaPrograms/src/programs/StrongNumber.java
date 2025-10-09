/*
Check if a Number is a Strong Number

Problem:
A number is called a Strong Number if the sum of the factorial of its digits is equal to the original number.

Example:

145 is a Strong Number because: 1! + 4! + 5! = 145


Task:
Write a Java program to check whether a given number is a Strong Number.

Example Input:

Enter a number: 145

Expected Output:

145 is a Strong Number.
 */

package programs;

import java.util.Scanner;

public class StrongNumber {

	// Method to calculate factorial of a digit
	public static int factorial(int num) {
		int fact = 1;
		for (int i  = 2; i <= num; i++) {
			fact  *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int temp = number;
		int sum = 0;
		
		// Process each digit
		while (temp > 0) {
			int digit = temp % 10;
			sum += factorial(digit);
			temp /= 10;
		}
		
		// check if it's Strong Number
		if (sum == number) {
			System.out.println(number + " is a Strong Number.");
		} else {
			System.out.println(number + " isn't a Strong Number.");
		}
		
		scanner.close();
	}

}
