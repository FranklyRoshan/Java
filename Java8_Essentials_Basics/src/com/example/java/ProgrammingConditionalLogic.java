package com.example.java;

import java.util.Scanner;

public class ProgrammingConditionalLogic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month.no: ");
		int monthNumber = scanner.nextInt();
	
		if (monthNumber >= 1 && monthNumber <= 3) {
			System.out.println("You're in the 1st Quater");
		} else if (monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You're in the 2nd Quater");
		} else if (monthNumber >= 7 && monthNumber <= 9) {
			System.out.println("You're in the 3rd Quater");
		} else if (monthNumber >= 10 && monthNumber <= 12) {
			System.out.println("You're in the 4th Quater");
		} else {
			System.out.println("That's an invalid month.no.");
		}
		
		scanner.close();

	}

}
