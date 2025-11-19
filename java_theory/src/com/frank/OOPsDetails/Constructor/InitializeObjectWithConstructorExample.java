package com.frank.OOPsDetails.Constructor;

/*
 * a Constructor
 * 
 * What? Assigns values when the object is created.
 * Why? Ensures the object starts with valid data.
 * How? Define a constructor and pass values.
 * */

class Fan {
	private String make;
	private double radius;
	private String color;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void display() {
		System.out.println(make + " " + radius + " " + color);
	}

}

public class InitializeObjectWithConstructorExample {

	public static void main(String[] args) {
		Fan fan = new Fan("Bajaj", 12.5, "White");
		fan.display();
	}

}
