package JavaPrograms;

import java.util.Scanner;

public class ScannerClass4 {
	
	public static void main (String[] args) {
		
		
		Scanner a = new Scanner (System.in);
		System.out.print("Enter a number: ");
		double num = a.nextDouble();
		System.out.println("Your number is " + num);
		a.close();
	}

}
