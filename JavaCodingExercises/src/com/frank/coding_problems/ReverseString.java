package com.frank.coding_problems;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String s) {
		char[] chars = s.toCharArray();
		int left = 0, right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = scanner.nextLine();

		System.out.println("Reveresed string: " + reverse(s));

		scanner.close();
	}

}
