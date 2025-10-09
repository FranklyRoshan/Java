/*
Java Methods

Definition:
A method in Java is a block of code that performs a specific task and can be reused. 
It helps in code modularity and reduces redundancy.

---

Types of Methods:

	1. Predefined methods (like System.out.println())
	2. User-defined methods (created by you)
	3. Static methods (can be called without an object)
	4. Instance methods (need an object to call)
---

Syntax:

returnType methodName(parameters) {
    // method body
}

---
 */

package basics;

public class Methods {

	// 1. No return, no parameter
	public static void greet() {
		System.out.println("Hello, Frank!");
	}
	
	// 2. With parameter, no return
	public static void printSum(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
	
	// 3. With return, with parameters
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	// 4. Calling methods from main()
	public static void main(String[] args) {
		greet();
		printSum(5, 10);
		int result = multiply(4, 6);
		System.out.println("Product: " + result);
	}
	
	
}
