package JavaPrograms;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		System.out.print("Enter the number layers: ");
		int layer = a.nextInt();
		
		for (int i = 0; i < layer; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			//Escape Sequence
			//System.out.print("\n"); 
		}
		
		a.close();
	}

}
