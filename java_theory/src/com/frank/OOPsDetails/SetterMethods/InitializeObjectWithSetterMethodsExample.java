package com.frank.OOPsDetails.SetterMethods;

/*Using Setter Methods
 * What? Assigns values after creating the object.
 * Why? Allows changing values later.
 * How? Create setter methods and call them.
 */

class Fan {
	private String make;
	private double radius;
	private String color;

	public void setMake(String make) {
		this.make = make;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void display() {
		System.out.println(make + " " + radius + " " + color);
	}

}

public class InitializeObjectWithSetterMethodsExample {

	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.setMake("Havells");
		fan.setRadius(14.0);
		fan.setColor("Black");
		fan.display();
	}

}
