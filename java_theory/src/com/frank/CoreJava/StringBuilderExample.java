package com.frank.CoreJava;

/*📌Using StringBuilder for Fast String Modifications 
 * 
 * What?A mutable string alternative optimized for performance.
 * 
 * Why?Faster than StringBuffer because it is not synchronized.Example:
 */
public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Efficient");

		builder.append(" string");
		builder.append(" operations");
		builder.delete(0, 4); // Removes "Effe"

		System.out.println(builder);
	}
}

/*
 * When to Use?
 * 
 * ✅ Frequent modifications in single-threaded programs
 * 
 * ❌ Avoid in multi-threaded environments (not thread-safe)
 */