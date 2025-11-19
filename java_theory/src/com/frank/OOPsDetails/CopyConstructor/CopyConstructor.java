package com.frank.OOPsDetails.CopyConstructor;

/*
 * What?
 * A copy constructor creates a new object by copying another object.
 * Why?
 * clone() copies everything. Copy constructor provides a way to customize what you want to copy!
 * How?
 * Define a constructor that takes an object of the same class as a parameter.
 * Example:
 */
class Fan {
	private String make;
	private double radius;
	private String color;

	// Constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// Copy Constructor
	public Fan(Fan other) {
		this.make = other.make;
		this.radius = other.radius;
		this.color = other.color;
	}

	public void display() {
		System.out.println(make + " " + radius + " " + color);
	}

	public static void main(String[] args) {
		Fan fan1 = new Fan("Havells", 12.5, "Black");
		Fan fan2 = new Fan(fan1); // Using copy constructor

		fan1.display();
		fan2.display();
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
