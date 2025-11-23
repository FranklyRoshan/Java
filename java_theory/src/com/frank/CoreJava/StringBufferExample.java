package com.frank.CoreJava;

/*📌Using StringBuffer for Thread-Safe Modifications 
 * 
 * What?A mutable string alternative that is thread-safe(synchronized).
 * 
 * Why?Ensures safe string modification in multi-threaded environments.Example:
 */
public class StringBufferExample {
	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("Thread-safe");

		buffer.append(" operations");
		buffer.insert(0, "Ensuring ");
		buffer.reverse();

		System.out.println(buffer);
	}
}

/*
 * When to Use?
 * 
 * ✅ Multi-threaded modifications
 * 
 * ❌ Avoid in single-threaded cases (slower than StringBuilder)
 */