package com.frank.CoreJava;

/*Why Are String Classes in Java Immutable? #
 * What? The String class in Java is immutable, meaning its value cannot be changed after creation.
 * Why?
 * Security – Strings are used in class loading, networking, and security keys. If mutable, an attacker could change "password123" to "password456".
 * Thread Safety – Since a String object cannot change, it can be shared safely across threads.
 * String Pooling Optimization – Multiple references to the same string reuse the same object, saving memory.
 */

// Example of String Immutability:
public class StringImmutableExample {
	public static void main(String[] args) {
		String s = "Hello";

		s.concat(" World"); // Creates a new object
		// does NOT modify `s`

		System.out.println(s); // Output: Hello
	}
}

/*
 * Why does "Hello" remain unchanged? → s.concat(" World") creates a new String,
 * but s still points to "Hello".
 */