package com.frank.OOPsConcepts;

class Cars {
	void drive() {
		System.out.println("Car is driving...");
	}
}

class ElectricCar extends Cars {
	void chargeBattery() {
		System.out.println("Battery is charging...");
	}
}

public class InheritanceExtendingFunctionality {
	public static void main(String[] args) {
		ElectricCar tesla = new ElectricCar();
		tesla.drive();
		tesla.chargeBattery();
	}
}

/*
 * Extending Functionality
 * 
 * What? Allows adding new behavior to an existing class.
 * 
 * Why? Enhances the base class without modifying it.
 * 
 * Example: ElectricCar extends Car to add battery functionality.
 * 
 */