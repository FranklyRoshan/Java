/*
Arrays

Definition:
An array in Java is a container object that holds 
a fixed number of elements of the same data type.

Types of Arrays:

1. One-Dimensional Array
2. Multi-Dimensional Array (e.g., 2D arrays)

Key Points:
Arrays are zero-indexed.
The size is fixed once declared.
You can use loops (like for, foreach) to iterate over arrays.

 */

package basics;

public class Arrays {

	public static void main(String[] args) {
		
		// One-Dimensional Array
		System.out.println("One-Dimensional Array");
		int[] numbers = {10, 20, 30, 40, 50};
		for (int i  = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
		
		
		// Two-Dimensional Array
		System.out.println("\nTwo-Dimensional Array");
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6}
		};
		for (int i = 0; i < matrix.length; i ++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Element of a matrix at " + (i + 1) + "x" + (j + 1) + " is: " + matrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
