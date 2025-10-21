package com.example.java;

public class HandlingExceptionsWithTryandCatchNull {

	public static void main(String[] args) {

		String str = "Welcome!";

		char[] chars = str.toCharArray();

		// Try/Catch Block (Alt + Shift + Z)

		try {
			char lastChar = chars[chars.length]; // char lastChar = chars[chars.length - 1];
			System.out.println(lastChar);
		} catch (Exception e) { // catch (ArrayIndexOutOfBoundsException e)
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
