/**
Java Exception Handling

Definition:
Exception Handling in Java is a mechanism to handle runtime errors 
so that the normal flow of the program is maintained.
---
Key Terms:

	1. Exception: An event that disrupts program execution 
	   (e.g., divide by zero, file not found).
	2. Try block: Code that might throw an exception.
	3. Catch block: Code that handles the exception.
	4. Finally block: Code that always runs (optional).
	5. Throw: Used to manually throw an exception.
	6. Throws: Declares exceptions a method might throw.
 */

// Handling Divide by Zero

package basics;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int result = 10 / 0; // This cause ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Undefined/Indeterminate");
		} finally {
			System.out.println("This always runs.");
		}
	}

}
