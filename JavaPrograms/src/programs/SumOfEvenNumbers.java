/*
 Codewars-style Question #9:

Problem: Sum of Even Numbers

Write a program that takes n numbers as input and prints the sum of all even numbers from them.

Example:

Input:
5
1 2 3 4 5

Output:
Sum of even numbers: 6
(2 + 4 = 6)
*/
package programs;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int sum = 0;
		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				sum += num;
			}
		}

		System.out.println("Sum of Even numbers: " + sum);

		scanner.close();
	}
}



/*
import java.util.Scanner;

public class SumOfEvenNumbers {
	public static int sumEven(int[]arr) {
		int sum = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				sum += num;
			}
		}

		return sum;
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter " + n + " of integers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = sumEven(arr);
		System.out.println("Sum of Even numbers: " + result);

		scanner.close();
	}
}
*/