package com.example.java;

import java.util.Scanner;

public class BuildingAStringFromMultipleValues {
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + ", " + str2 + "!";
		System.out.println(str2);

		StringBuilder sb = new StringBuilder("Hello").append(" ").append("World").append("!");
		/*
		 * StringBuilder sb = new StringBuilder("Hello"); sb.append(" ");
		 * sb.append("World"); sb.append("!");
		 */
		System.out.println(sb);



		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		sb.delete(0, sb.length());
		for (int i = 0; i < 3; i++) {
			input = scanner.nextLine();
			sb.append(input + "\n");
		}

		System.out.println(sb);

		scanner.close();

	}

}
