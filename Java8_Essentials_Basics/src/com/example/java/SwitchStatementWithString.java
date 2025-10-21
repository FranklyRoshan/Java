package com.example.java;

import java.util.Scanner;

public class SwitchStatementWithString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a month: ");
		String input = scanner.nextLine();

		switch (input) {
		case "Jan":
			System.out.println("The month is 1.");
			break;
		case "Feb":
			System.out.println("The month is 2.");
			break;
		case "Mar":
			System.out.println("The month is 3.");
			break;
		default:
			System.out.println("Chose another month.");
		}

		scanner.close();
	}

}
