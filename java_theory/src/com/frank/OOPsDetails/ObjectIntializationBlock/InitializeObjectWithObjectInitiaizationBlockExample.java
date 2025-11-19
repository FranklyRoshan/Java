package com.frank.OOPsDetails.ObjectIntializationBlock;

/*Using Object Initialization Block
 * What? Initializes variables inside an instance block.
 * Why? Ensures some default values before constructors run.
 * Usecase? Avoids code duplication in multiple constructors.
 * How? Use { } blocks inside the class.*/

class Fan {
	private String make;
	private double radius;
	private String color;
	private String serialNumber;

	// Instance Initialization Block
	// Runs before any constructor
	// Common to multiple constructors!
	{
		// Let's assume that this is unique!
		serialNumber = "FAN-" + System.currentTimeMillis();
	}

	// Default Constructor
	public Fan() {
		System.out.println("Default Constructor: ");
	}

	// Constructor with make and radius
	public Fan(String make, double radius) {
		this.make = make;
		this.radius = radius;
		System.out.println("Constructor: make and radius");
	}

	// Fully Parameterized Constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		System.out.println("Constructor: make, radius, and color.");
	}

	public void display() {
		System.out.println(serialNumber + " " + make + " " + radius + " " + color);
	}
}

public class InitializeObjectWithObjectInitiaizationBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
