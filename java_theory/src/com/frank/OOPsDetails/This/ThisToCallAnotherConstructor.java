package com.frank.OOPsDetails.This;

//Using this() (Calling Another Constructor)
class Fan {
	private String make;
	private double radius;
	private String color;

	// Constructor 1
	public Fan() {
		this("Havells", 12.0, "Black"); // Calls Constructor 2
	}

	// Constructor 2
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void display() {
		System.out.println(make + " " + radius + " " + color);
	}

	public static void main(String[] args) {
		// Calls first constructor
		// which calls the second constructor
		Fan fan = new Fan();
		fan.display();
	}
}


public class ThisToCallAnotherConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
