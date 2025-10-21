package com.example.java;

public class UnderstandingSyntaxOrCompiletimeErrorAndRuntimeExceptions {

	public static void main(String[] args) {
		// A squiggly line (~), formally known as a tilde
		
		// Syntax/Compile-time Error

		// Before
		// String a = Null; // Null cannot be resolved to a variable
		// After
		String a = null;

		// Run-time Error
		String b = "Welcome!";
		char[] chars = b.toCharArray();

		// Before
		// ArrayIndexOutOfBoundsException
		// char lastChar = chars[chars.length]; // length is property, Not a method. So,
		// No need for () "Paranthesis".
		// After
		char lastChar = chars[(chars.length) - 1];
		System.out.println(lastChar);

	}

}
