package com.frank.revision;

public class Operators {

	public static void main(String[] args) {
		int a = 10, b = 5;

		// Arithmetic Operators
		System.out.println(a + b); // 15
		System.out.println(a - b); // 5
		System.out.println(a * b); // 50
		System.out.println(a / b); // 2
		System.out.println(a % b); // 0

		// Relational Operators
		System.out.println(a > b); // true
		System.out.println(a == b); // false

		String s1 = "hello"; // Stored in Memory Location A (String Pool)
		String s2 = "hello"; // Also points to Location A (optimized by Java String Pool)

		String s3 = new String("hello"); // Forces a new object in Memory Location B
		String s4 = new String("hello"); // Forces a new object in Memory Location C

		System.out.println(s1 == s2); // True (Optimized to same location)
		System.out.println(s3 == s4); // False (Two different memory locations/objects)
		System.out.println(s1 == s3); // False (Different memory locations)

		// Logical Operators
		System.out.println(a > 5 && b < 10); // true
		System.out.println(a > 5 || b > 10); // true
		System.out.println(!(a == b)); // true

		// Assignment Operators
		a += 3; // a = a + 3 → 13
		System.out.println(a);

		// Unary Operator
		a++; // Increment → 14
		System.out.println(a);

		// Special operators
		Object obj = "Hello"; // or any String value
		if (obj instanceof String) {
			System.out.println("It's a string!");
		}
	}

}
