package com.frank.CoreJava;

/*How Does intern() Work? #
 * 
 * What? Forces a string to be stored in the String Pool, even if it was created using new.
 * Why? Helps reduce duplicate objects and optimize memory.
 * 
 * Example of intern() Method:
 * s1 is created outside the pool, but s1.intern() moves it into the pool.
 * s2 and s3 now share the same reference, saving memory.
 */

public class StringInternExample {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = s1.intern(); // Moves to String Pool
		String s3 = "Hello";
		System.out.println(s2 == s3); // Output: true
	}
}
