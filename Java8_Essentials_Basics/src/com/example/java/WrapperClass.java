package com.example.java;

public class WrapperClass {

	public static void main(String[] args) {

		// Boxing: Converting primitive to Wrapper
		int a = 10;
		int obj1 = a; // Explicit boxing
		Integer obj2 = a; // Auto-boxing

		// Unboxing: Converting Wrapper to primitive
		int b = obj1; // Explicit unboxing
		int c = obj2; // Auto-unboxing

		System.out.println("a: " + a);
		System.out.println("obj1 (Boxed): " + obj1);
		System.out.println("obj2 (Auto-boxed): " + obj2);
		System.out.println("b (Unboxed): " + b);
		System.out.println("c (Auto-unboxed): " + c);

		// Boolean Wrapper
		Boolean boolObj = Boolean.valueOf(true);
		boolean flag = boolObj; // Auto-unboxing
		System.out.println("Boolean Wrapper: " + boolObj);
		System.out.println("Primitive boolean: " + flag);

		// Some helper methods from wrapper classes
		System.out.println("Max Integer: " + Integer.MAX_VALUE);
		System.out.println("Min Integer: " + Integer.MIN_VALUE);
		System.out.println("Parse String to Int: " + Integer.parseInt("123"));
		System.out.println("Compare 10 & 20: " + Integer.compare(10, 20));
	}

}
