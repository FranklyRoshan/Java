package com.frankly.java.loops;

import java.util.Scanner;

public class DoWhileExerciseRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = -1;
//		The code will run util the user some negative integer
		do {
			if (number != -1) {
				System.out.println("Cube is: " + (number * number * number));
			}
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
		} while (number >= 0);

		System.out.println("Thank you, Have Fun!");
	}

}
