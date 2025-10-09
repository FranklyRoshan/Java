/*
LeetCode-style Question #3:

Problem:
Write a function that takes an array of integers and returns the maximum number in the array.

Example:

Input: [3, 7, 2, 9, 5]
Output: 9
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integers: ");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		System.out.println("The maximum number is: " + max);

		scanner.close();
	}
}
*/

/*
import java.util.Scanner;

public class MaxInArray {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr [i] = scanner.nextInt();
		}
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr [i] > max) {
				max = arr[i];
			}
		}

		System.out.println("The largest number is: " + max);
		scanner.close();
	}
}
*/

/*
import java.util.*;
import java.util.Scanner;

public class MaxInArray {
	public static void main(String... args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		List<Integer> list = new ArrayList<>();

		System.out.println("Enter " + n + " integers: ");
		for(int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		int max = Collections.max(list);
		System.out.println("The maximum number is: " + max);

		scanner.close();
	}
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the  number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " integers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("The maximum number is: " + max);

		scanner.close();
	}
}
*/

/*
import java.util.Scanner;

public class MaxInArray {
	public static int findMax (int[] arr) {
		int  max = arr[0]; // Assume first element is the max

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask the user for array size
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		// Intialize array
		int[] arr = new int[n];

		// Read elements into the array
		System.out.println("Enter " + n + " integers: ");
		for (int i = 0; i<n; i++) {

			arr[i] = scanner.nextInt();
		}

		// Find and print the maximum number
		int max = findMax(arr);
		System.out.println("The maximum number is: " + max);

		scanner.close();
	}

}
*/
package programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
	public static void main (String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int [n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr [i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		System.out.println("The largest number is: " + arr[n -1]);
		scanner.close();
	}
}