package JavaPrograms;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		System.out.print("Enter the number of rows: ");
		int row = a.nextInt();
		
		for (int i=0; i<row; i++) {
			
			for (int j=i; j<row; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		a.close();
	}

}
