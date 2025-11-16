package com.frank.OOPsConcepts;

class Vehicle {
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving...");
	}
}

class Bike extends Vehicle {
	void ride() {
		System.out.println("Bike is riding...");
	}
}

public class InheritanceForCodeReusability {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.drive();

		Bike bike = new Bike();
		bike.start();
		bike.ride();
	}
}

/*
 * Code Reusability
 * 
 * What? Allows a class to reuse properties and methods of another class.
 * 
 * Why? Avoids duplicate code and promotes efficient programming.
 * 
 * Example: Car and Bike inherit common behavior from Vehicle.
 * 
 */
