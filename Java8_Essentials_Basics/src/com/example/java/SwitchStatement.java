package com.example.java;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a month.no: ");
		String input = scanner.nextLine();
		int monthNumber = Integer.parseInt(input);

		switch (monthNumber) {
		case 1:
			System.out.println("The month is January.");
			break;
		case 2:
			System.out.println("The month is Febuary.");
			break;
		case 3:
			System.out.println("The month is March.");
			break;
		default:
			System.out.println("Chose another month.");
		}

		scanner.close();
	}

}
