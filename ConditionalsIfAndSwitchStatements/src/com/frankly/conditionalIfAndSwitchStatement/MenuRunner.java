package com.frankly.conditionalIfAndSwitchStatement;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// Type obj = new Type(argument);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (a): ");
		int a = scanner.nextInt();

		System.out.print("Enter an another number (b): ");
		int b = scanner.nextInt();

		System.out.println("Available Choices are: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		System.out.println("5 - Modulo");

		System.out.print("Enter your choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your choice are");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Your choice " + choice);

//		performOperationUsingNestedIfElse(a, b, choice);
//		performOperationUsingSwitch(a, b, choice);
//		puzzle1();
//		puzzle2();
//		puzzle3();
//		puzzle4();
//		puzzle5();
		puzzle6();

		scanner.close();
	}

	private static void performOperationUsingNestedIfElse(int a, int b, int choice) {
		if (choice == 1) {
			System.out.println("a + b: " + (a + b));
		} else if (choice == 2) {
			System.out.println("a - b: " + (a - b));
		} else if (choice == 3) {
			System.out.println("a * b: " + (a * b));
		} else if (choice == 4) {
			System.out.println("a / b: " + (a / b));
		} else if (choice == 5) {
			System.out.println("a % b: " + (a % b));
		} else {
			System.out.println("Invalid Operation");
		}
	}

	private static void performOperationUsingSwitch(int a, int b, int choice) {

		switch (choice) {
		case 1:
			System.out.println("a + b: " + (a + b));
			break;
		case 2:
			System.out.println("a - b: " + (a - b));
			break;
		case 3:
			System.out.println("a * b: " + (a * b));
			break;
		case 4:
			System.out.println("a / b: " + (a / b));
			break;
		case 5:
			System.out.println("a % b: " + (a % b));
			break;
		default:
			System.out.println("Invalid Operation");
			break;

		}
	}

	private static void puzzle1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
//			break;
		case 2:
			System.out.println(2);
//			break;
		case 3:
			System.out.println(3);
//			break;
		default:
			System.out.println("Default");
//			break;
		}
	}

	private static void puzzle2() {
		int number = 2;

		// Fall Through code
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle3() {
		int number = 10;

		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle4() {
		int number = 10;

		switch (number) {
		default:
			System.out.println("Default");
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		}
	}

	private static void puzzle5() {
//		long l = 15;
//		double d =  45;
//		boolean b = true;
//		Cannot switch on a value of type long, double, boolean. 
//		Only convertible int values, strings or enum variables are permitted

		int i = 1;
		switch (1) {

		}
	}

	private static void puzzle6() {
		int number = 10;
		int i = number * 2;
		switch (number) {
//		Conditions can't be used within the switch case
//		case number > 5:
//			System.out.println("number > 5");
		}
	}
}
