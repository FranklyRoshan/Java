package com.frankly.java.loops;

import java.util.Scanner;

public class DoWhileExercise2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number (a): ");
		int a = scanner.nextInt();
		
		System.out.print("Enter a number (b): ");
		int b = scanner.nextInt();
		
		int c = 5;
		
		do {
			if (c != 5) {
				switch(c) {
				case 1:
					System.out.println("a + b = " + (a + b));
					break;
				case 2:
					System.out.println("a - b = " + (a - b));
					break;
				case 3:
					System.out.println("a * b = " + (a * b));
					break;
				case 4: 
					System.out.println("a / b = " + (a / b));
					break;
				} 
			}
			
			System.out.print("Enter your option: ");
			c = scanner.nextInt();
		} while (c < 5);
		
		System.out.println("Exit");
	
	}

}
