package com.frank.java.tips;

// IDE's bracket matching feature (ctrl + Shift + p)

public class BlocksRunner {

	public static void main(String[] args) {
		// Entry point of the application
		System.out.println("Main Method");

		// Conditional block: Executes only if the condition (2 > 1) is true
		if (2 > 1) {
			System.out.println("2 > 1");
		}

		// Standalone code block: Demonstrates variable scope
        // Variables declared here (like 'i') are local to this block
		{
			int i;
			System.out.println("3>2");
		} // Code Block

		// 'i' is not accessible here, demonstrating block scope

	} // End of the main method

} // End of the BlocksRunner class definition

/*
 * In Java, curly braces {} define blocks of code and establish scope. They are
 * used to group multiple statements together and define the boundaries for
 * classes, methods, loops, conditionals, and other code structures.
 *
 * Structure: They enclose the body of a class, method, loop (for, while), or
 * conditional (if, else).
 *
 * Scope: Variables declared inside a block (between {}) are only accessible
 * within that block and are destroyed when the block ends.
 *
 * For example, a variable declared inside an if statement's braces cannot be
 * used outside of it.
 */