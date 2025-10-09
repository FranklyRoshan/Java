/*
Return Type Method in Java

A return type method is a method that returns a value back to the caller after execution.

It must declare the type of value it will return 
(like int, String, double, etc.) in the method signature, 
and it must use the return keyword to return that value.
 */

package basics;

public class ReturnStatement {

	public static void main(String[] args) {
		System.out.println("Start");
		printMessage();
		System.out.println("End");
	}
	
	public static void printMessage() {
		System.out.println("Inside method");
		return; // ends methods early
	}

}
