/*
Class and Object in Java

What is a Class?
A class is a blueprint for creating objects. 
It defines fields (variables) and methods (functions).

What is an Object?
An object is an instance of a class. 
It has state (data) and behavior (methods).
 */

package basics;

// class
class Car {
	// Fields / Attributes
	String  brand;
	int year;
	
	// Method
	void startEngine() {
		System.out.println(brand + " engine started.");
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		// Creating an object of Car
		Car myCar = new Car();
		
		// Assigning values
		myCar.brand = "Koenigsegg";
		myCar.year = 2025;
		
		// Using object methods
		myCar.startEngine();
		// Output: Koenigsegg engine started.
		
	}

}
