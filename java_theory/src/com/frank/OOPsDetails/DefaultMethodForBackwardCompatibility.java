package com.frank.OOPsDetails;

/*
 * What
 * Default methods in interfaces (introduced in Java 8) allow adding new methods without breaking existing implementations.
 * This avoids the need to modify all implementing classes, making library upgrades smoother.
 * 
 * Problem: Adding a New Method to an Interface
 * Consider an interface with an existing method methodA() and four implementations:
 */

//Defined in a Common Library
interface ExampleInterface {
	void methodA(); // Existing method

	/*
	 * Option 1: Adding methodB() to Interface (Without Default Method) All four
	 * classes must implement methodB(), or the code won’t compile.
	 */
	// New method added
	// Breaks existing implementations
//	void methodB();

	/*
	 * If this interface is part of a library and the four implementations are in
	 * different components, every component must be updated, which is not practical
	 * for backward compatibility.
	 * 
	 * Option 2: Using a Default Method for Backward Compatibility Instead of
	 * breaking all implementations, we provide a default implementation in the
	 * interface. Existing classes continue to work without modification, but they
	 * can override methodB() if needed.
	 */
		default void methodB() {
			System.out.println("Default methodB implementation");
		}

}

// Four different classes implementing the interface
// In Four Different Projects!

class Class1 implements ExampleInterface {
	@Override
	public void methodA() {
		System.out.println("Class1 - methodA");
	}
}

class Class2 implements ExampleInterface {
	@Override
	public void methodA() {
		System.out.println("Class2 - methodA");
	}
}

class Class3 implements ExampleInterface {
	@Override
	public void methodA() {
		System.out.println("Class3 - methodA");
	}
}

class Class4 implements ExampleInterface {
	@Override
	public void methodA() {
		System.out.println("Class4 - methodA");
	}
}

public class DefaultMethodForBackwardCompatibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
