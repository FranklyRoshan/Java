package com.frank.CoreJava;

/*Why Are Wrapper Classes in Java Immutable?#

📌What is Immutability?

What?
Immutability means an object cannot be modified after it is created.

Why?
Helps with thread safety,caching,and predictable behavior.

How?
Any modification creates a new object instead of changing the existing one.

Example of an Immutable Class in Java:
Final class prevents subclassing.
Private final fields prevent changes after initialization.
No setter methods ensure immutability.
*/

final class ImmutableExample {
	private final int value;

	ImmutableExample(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

/*
 * 📌 Wrapper Classes are Immutable
 * 
 * What? Wrapper classes (Integer, Double, Boolean, etc.) are immutable in Java.
 * 
 * Why? Caching Mechanism – Frequently used values (Integer.valueOf(10)) are
 * reused, reducing memory usage.
 * 
 * Thread Safety – Threads cannot modify shared values.
 */

// Example of Wrapper Class Immutability:
	public class WrapperImmutableExample {
		public static void main(String[] args) {
			Integer x = 10;

			// Creates a new Integer object,
			// old one is discarded
			x = x + 1;

			System.out.println(x); // Output: 11
		}
}
