package com.example.java;

public class DebuggingWithEclipse {

	public static void main(String[] args) {

		// Debug Mode (Alt + Shift + D, J)

		String str = "Welcome!";

		char[] chars = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(chars[i]);
		}

	}

}
