package com.frank.coding_problems;

import java.util.Scanner;

public class CountVowels {

	public static int countVowels(String s) {

		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scanner.nextLine();

		System.out.println("No. of vowel in a String is: " + countVowels(s));

		scanner.close();

	}

}
