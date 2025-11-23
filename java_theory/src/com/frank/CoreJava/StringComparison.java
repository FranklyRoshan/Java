package com.frank.CoreJava;


public class StringComparison {

	public static void main(String[] args) {
		// What are the things to be careful about when comparing Strings? #

		/*
		 * Using == instead of .equals()
		 * == compares references, not values.
		 * Always use .equals() to check content equality.
		 */
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // false (different objects)
		System.out.println(s1.equals(s2)); // true (same content)
		
		// Case Sensitivity
		// equals() is case-sensitive. Use equalsIgnoreCase() for case-insensitive checks.
		
		System.out.println("hello".equalsIgnoreCase("HELLO")); // true
		
		// String Pool Behavior
		/*
		 * String literals are stored in the String Constant Pool and can be shared.
		 * Using new String() creates a new object, even if the same value exists.
		 */
		String a = "Java"; 
		String b = "Java"; 

		// true (same object in pool)
		System.out.println(a == b); 

		String c = new String("Java");

		// false (different objects)
		System.out.println(a == c);

		
	}

}
