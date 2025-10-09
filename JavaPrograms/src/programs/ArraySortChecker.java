/*
Question: "Check if an array is sorted (ascending or descending)"

Problem Statement:
Write a Java program to check whether a given integer array is sorted in ascending order, descending order, or not sorted at all.

Example Input:
[3, 5, 8, 10] → Ascending
[9, 6, 3, 1] → Descending
[5, 2, 8, 4] → Not Sorted
 */

package programs;

import java.util.Scanner;

public class ArraySortChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input array size
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		
		int [] arr = new int[n];
		
		// Input array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		boolean isAscending = true;
		boolean isDescending = true;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i -1]) {
				isDescending = false;
			} else if (arr[i] < arr[i -1]) {
				isAscending = false;
			}
		}
		
		if (isAscending) {
			System.out.println("The array is sorted in ascending order.");
		}	else if (isDescending) {
			System.out.println("The array is sorted in descending order.");
		} else {
			System.out.println("The array is not sorted.");
		}
		
		scanner.close();
	}

}


/*
public class ArraySortChecker {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input array size
		System.out.print("Enter size of array: ");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		// Input elements
		System.out.println("Enter array elemens: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		// Manually check for ascending
		int i;
		for (i = 1; i < n; i++) {
			if(arr[i] < arr[i - 1]) {
				break;
			}
		}
		if(i == n) {
			System.out.println("The array is sorted in ascending order.");
			return;
		}
		
		// Manually check for descending
		for (i = 1; i < n; i++) {
			if (arr[i] > arr[i -1]) {
				break;
			}
		}
		if (i == n) {
			System.out.println("The array is sorted in descending order.");
		} else {
			System.out.println("The array is not sorted");
		}
		
	}
}
*/

/*
import java.util.Arrays;

public class ArraySortChecker {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input array size
		System.out.print("Enter the size of an array: ");
		int n = scanner.nextInt();
		int [] arr = new int[n];
		
		// Input elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		// Make copies
		int[] ascending = Arrays.copyOf(arr, n);
		int[] descending = Arrays.copyOf(arr, n);
		
		// sort the copies
		Arrays.sort(ascending);
		Arrays.sort(descending);
		
		// Reverse descending
		for (int i = 0; i < n/2; i++) {
			int temp = descending[i];
			descending[i] = descending[n - 1 - i];
			descending [n - 1 - i] = temp;
		}
		
		// Compare with original
		if (Arrays.equals(arr, ascending)) {
			System.out.println("The array is sorted in ascending order.");
		} else if (Arrays.equals(arr, descending)) {
			System.out.println("The array is sorted in descending order.");
		} else {
			System.out.println("The array is not sorted.");
		}
		
		scanner.close();
	}
}
*/