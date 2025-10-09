/*
 Question: Count Even and Odd Numbers in an Array

Problem Statement:
Write a Java program to count how many even and odd numbers are present in an integer array.


---

Example:

Input:

[10, 21, 4, 7, 9, 16]

Output:

Even numbers: 3
Odd numbers: 3


---

Constraints:

Use a simple loop.

Use % operator to check even/odd.
 */
package programs;

import java.util.Scanner;

public class CountEventOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " of element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even numbers: " + evenCount);
		System.out.println("Odd numbers: " + oddCount);

		scanner.close();
	}

}
