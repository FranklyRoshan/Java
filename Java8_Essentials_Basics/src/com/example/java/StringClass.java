package com.example.java;

public class StringClass {
	public static void main(String[] args) {
		// String Literal
		String s1 = "This is a String";
		System.out.println(s1);

		// Using new String() Constructor
		String s2 = new String("This is also String");
		System.out.println(s2);

		// String Concatenation
		String s3 = "Shirt size: ";
		String s4 = "M";
		String s5 = s3 + s4;
		String s6 = s5 + ", Qty: " + 4;
		System.out.println(s5);
		System.out.println(s6);

		// Creating String from char[]
		char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
		String s7 = new String(chars);
		System.out.println(s7);

		// Converting String to char[]
		char[] chars2 = s6.toCharArray();
		for(char c : chars2) {
			System.out.println(c);
		}


	}

}
