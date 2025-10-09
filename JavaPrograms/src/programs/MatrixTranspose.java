/*
 Question: "Transpose of a Matrix"

Description:
Write a Java program to compute the transpose of a matrix. The transpose of a matrix is obtained by swapping its rows with its columns.

Example:
Input:

1 2 3  
4 5 6

Output (Transpose):

1 4  
2 5  
3 6
 */

package programs;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input rows and columns
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of columns: ");
		int cols = scanner.nextInt();
		
		int [][] matrix = new int[rows][cols];
		int [][] transpose = new int[cols][rows];
		
		// Input matrix
		System.out.println("\nEnter the matrix element: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\nMatrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// Transpose logic 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		// Display transpose
		System.out.println("\nTranspose of the matrix: ");
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
