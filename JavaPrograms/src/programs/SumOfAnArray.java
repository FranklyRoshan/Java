/*
 Question: Find the Sum of an Array

Problem Statement:
Write a Java program to calculate the sum of all elements in an array.

Example 1:

Input:
[2, 4, 6, 8]

Output:
20


Example 2:

Input:
[1, 3, 5]

Output:
9

Constraints:

Use a loop to add the numbers.
No need for Scanner yet unless you want.
 */

/*
public class SumOfAnArray {
	public static void main(String... args) {
		int[] numbers = {2, 4, 6, 8};
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		System.out.println("The sum of the array is: " + sum);
	}
}

*/
package programs;

import java.util.Scanner;

public class SumOfAnArray {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of element: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter a " + n + " of elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int num: arr) {
			sum += num;
		}

		System.out.println("The sum of an array is: " + sum);
		scanner.close();
	}

}



/*
import java.util.Scanner;

public class SumOfAnArray {
	public static int sumOfAnArray(int[]arr) {
		int sum = 0;
		for (int num: arr) {
				sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter a " + n + " of elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int result = sumOfAnArray(arr);
		System.out.println("The sum of an array is: " + result);

		scanner.close();
	}

}
*/