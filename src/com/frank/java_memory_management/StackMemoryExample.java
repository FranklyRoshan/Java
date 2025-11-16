package com.frank.java_memory_management;

public class StackMemoryExample {

	public static void main(String[] args) {
		int a = 10; // Stored in Stack
		int b = 20; // Stored in Stack
		add(a, b); // Creates new Stack Frame
	}

	static int add(int x, int y) {
		// Parameters, Local variables stored in Stack
		int sum = x + y;
		return sum;
	}
}

/*
 * Stack Memory
 * 
 * What? Stores method calls & local variables.
 * 
 * When? Exists only during method execution.
 * 
 * Where? Each thread has its own stack.
 * 
 * 
 * Code Example
 * 
 * New stack frame is created when add(a, b) is called.
 * 
 * Stack frame is removed when add() finishes, freeing memory.
 */
