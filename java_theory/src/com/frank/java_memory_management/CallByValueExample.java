package com.frank.java_memory_management;

public class CallByValueExample {

	static void modify(int num) {
		num = num + 10;
	}

	public static void main(String[] args) {
		int x = 20;
		modify(x);
		System.out.println(x); // Output: 20 (unchanged)
	}

}

/*
 * Java is always "Call by Value" – for primitives, it passes values, and for
 * objects, it passes reference copies
 * 
 * 📌 Call by Value
 * 
 * What? A copy of the value is passed to the method. The original variable
 * remains unchanged after the method call.
 * 
 */
