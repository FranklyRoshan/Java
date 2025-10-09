package JavaPrograms;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		int space, spacelimit;
		
		Scanner a = new Scanner (System.in);
		System.out.print("Enter the number of rows: ");
		int rows = a.nextInt();
		
		spacelimit = (rows*2) - 2;
		
		for (int i = 0; i<rows; i++) {
			for (space=0; space<spacelimit; space++) {
				System.out.print(" ");
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
			spacelimit = spacelimit - 2;
		}
		a.close();
	}
}
}

//Syntax Error
