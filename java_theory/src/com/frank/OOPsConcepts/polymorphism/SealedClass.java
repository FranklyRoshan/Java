package com.frank.OOPsConcepts.polymorphism;

/*Example: Sealed Class
 * 
 * Only allowed subclasses (Car, Truck, Bike) can extend Vehicle.
 * 
 * Car is final, so it cannot be extended further.
 * 
 * Truck is non-sealed, so any class can extend it.
 * 
 * Bike is sealed again, allowing only ElectricBike to extend it.
 */

sealed class Vehicle permits Car, Truck, Bike {
}

//No further subclassing  
final class Car extends Vehicle {
}

//Can be extended freely  
non-sealed class Truck extends Vehicle {
}

sealed class Bike extends Vehicle permits ElectricBike {
}

//No further subclassing  
final class ElectricBike extends Bike {
}

public class SealedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 📌 Summary:
 * 
 * Java New Feature: Introduced in Java 17 Restricts
 * 
 * Inheritance: Only specified classes can extend or implement. Prevents
 * Unwanted
 * 
 * Subclassing: No accidental extensions.
 * 
 * Improves Maintainability: Clearer type hierarchy.
 */
