/*
Question: "Matrix Diagonal Sum"

Write a Java program that:

Takes input for a square matrix (n x n).

Calculates the sum of both the primary and secondary diagonals.

Displays both sums.
 */

package programs;

import java.util.Scanner;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input size of square matrix
		System.out.print("Enter size of square matrix (n): ");
		int n = scanner.nextInt();

		int [][] matrix = new int[n][n];

		// Input matrix elements
		System.out.println("Enter the matrix elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrix[i][j] = scanner.nextInt();
 			}
		}

		int primarySum = 0, secondarySum = 0;

		for (int i = 0; i < n; i++) {
			primarySum += matrix[i][i]; // Top-left to bottom-right
			secondarySum += matrix[i][n - i - 1]; // Top-right to bottom-left
		}

		// Display the results
		System.out.println("\nPrimary Diagonal Sum: " + primarySum);
		System.out.println("Secondary Diagonal Sum: " + secondarySum);

		scanner.close();
	}

}
