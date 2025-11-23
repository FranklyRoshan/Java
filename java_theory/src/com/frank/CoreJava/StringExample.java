package com.frank.CoreJava;

/*📌Using String for Immutable Data 
 * 
 * What?
 * Used for storing fixed values like constants,configuration keys,or error messages.
 * 
 * Example:
 */
public class StringExample {
	public static void main(String[] args) {
		String greeting = "Hello";
		greeting += " World"; // Creates a new String object

		System.out.println(greeting); // Output: Hello World
	}
}

/*
 * When to Use String class?
 * 
 * ✅ Fixed values that do not change
 * 
 * ❌ Avoid for frequent modifications (creates multiple objects)
 */
