/*
Question: "Matrix Spiral Traversal"

Description: Write a Java program to print the elements of an n x n matrix in spiral order.

Example:

For input:

1  2  3  
4  5  6  
7  8  9

Output:

1 2 3 6 9 8 7 4 5

This will challenge your understanding of 2D arrays, loops, boundaries, and edge cases.
 */

package basics;

import java.util.Scanner;

public class MatrixSpiralTraversal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input size
		System.out.print("Enter the size of the square matrix (n): ");
		int n = scanner.nextInt();
		
		int[][] matrix = new int[n][n];
		
		// Input matrix elements
		System.out.println("Enter the matrix elements: ");
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Element [" + (i + 1) +  "][" + (j + 1) + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		// Spiral order logic
		int top = 0, bottom = n - 1;
		int left = 0, right = n - 1;
		
		System.out.println("\nSpiral Order: ");
		while (top <= bottom && left <= right) {
			// Traverse from left to right
			for (int i = left; i <= right; i++) 
				System.out.print(matrix[top][i] + " ");
			top++;
				
			// Traverse from top to bottom
			for (int i = top; i <= bottom; i++) 
				System.out.print(matrix[i][right] + " ");
			right--;
			
			// Traverse form right to left
			if (top <= bottom) {
				for(int i = right; i >= left; i--)
					System.out.print(matrix[bottom][i] + " ");
				bottom--;
			}
			
			// Traverse from bottom to top
			if (left <= right) {
				for (int i = bottom; i >= top; i--)
					System.out.print(matrix[i][left] + " ");
				left++;
			}
		}
		
		scanner.close();
	}

}
