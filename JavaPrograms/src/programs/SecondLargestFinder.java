/*
 Question: Find the Second Largest Number in an Array

Problem Statement:
Given an array of integers, find and return the second largest number.

You must not sort the array.

Try to do it in one pass (one loop) if possible.



Example 1:

Input:
[10, 5, 20, 8, 15]

Output:
15


Example 2:

Input:
[4, 4, 4, 4]

Output:
Second largest does not exist.

(Since all elements are the same.)
 */

/*
import java.util.Scanner;

public class SecondLargestFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int  n  = scanner.nextInt();

		if(n < 2) {
			System.out.println("Array must have at least two elements.");
		}

		int[] arr = new int[n];
		System.out.println("Enter the elements: ");

		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Integer largest = null;
		Integer secondLargest = null;

		for (int num : arr) {
			if (largest == null || num > largest) {
				secondLargest = largest;
				largest = num;
			} else if ((secondLargest == null || num > secondLargest) && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == null) {
			System.out.println("The Second largest doesn't exist.");
		} else {
			System.out.println("The second largest number is: " + secondLargest);
		}

		scanner.close();
	}

}

*/

/*
import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestFinder {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int n = scanner.nextInt();

		if (n < 2) {
			System.out.println("Array must have at least two elements.");
			return;
		}

		int[] arr = new int[n];
		System.out.println("Enter the elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);

		int largest = arr[n - 1];
		for (int i = n-2; i >= 0; i--) {
			if (arr[i] != largest) {
				System.out.println("The second largest number is: " + arr[i]);
				return;
			}
		}

		System.out.println("The second largest doesn't exist.");
		scanner.close();
	}
}
*/

/*
import java.util.Scanner;

public class SecondLargestFinder {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of an array: ");
		int n = scanner.nextInt();

		if (n < 2) {
			System.out.println("Array length must be greater than two.");
		}

		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is No Second Largest element found.");
		} else {
			System.out.println("The Second largest number is: " + secondLargest);
		}

		scanner.close();
	}
}

*/
package programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestFinder {
	public static void main (String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter length of the Array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter the elements of an Array: ");
		for (int i = 0; i < n; i++) {
			arr [i] = scanner.nextInt();
		}

		scanner.close();

		// Sort the array in ascending order
		Arrays.sort(arr);

		// Traverse form the end to find the  second largest unique number
		int largest = arr[arr.length - 1];

		for (int i  = arr.length - 2; i >= 0; i--) {
			if(arr[i] != largest) {
			System.out.println("Second largest number is: " + arr[i]);
			return;
			}
		}

		System.out.println("There is No Second Largest element found.");

	}
}