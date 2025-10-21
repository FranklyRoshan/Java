package com.example.java;

public class ParsingStringValues {

	public static void main(String[] args) {

		String s1 = "Welcome to California";
		System.out.println("Length of a String: " + s1.length());

		int position = s1.indexOf("California");
		System.out.println("Position of substring: " + position);

		String sub = s1.substring(11); // String sub = s1.substring(position);
		System.out.println(sub);

		String s2 = "		Welcome!		";
		int len = s2.length();
		System.out.println("Length of the string (s2) w/trim: " + len);

		String s3 = s2.trim();
		System.out.println("Length of the string (s3) w/o trim: " + s3.length());
	}

}
