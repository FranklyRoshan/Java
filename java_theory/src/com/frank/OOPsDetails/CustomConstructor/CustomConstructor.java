package com.frank.OOPsDetails.CustomConstructor;

/*
 * Will a default constructor be provided if you define a custom constructor?
 * No: Java does NOT provide a default constructor if a custom constructor is defined.
 * Example Without Custom Constructor
 */

//public class Fan {
//	private String make;
//	// Java automatically provides:
//	// public Fan() { }
//}

//`new Fan();` 
// Java adds a default constructor.
//Example With Custom Constructor (No Default Constructor)
class Fan {
//	private String make;

	private String make;

	// Custom Constructor
	public Fan(String make) {
		this.make = make;
	}

}

public class CustomConstructor {

	public static void main(String[] args) {
		Fan fan1 = new Fan("Havells"); // ✅ Works
//		Fan fan2 = new Fan(); // ❌ Compilation Error
	}

}
