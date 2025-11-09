package com.frank.api.i;

public class SealedClassesRunner {

	sealed class Vehicle permits Car, Truck, Bike {
	}


//	final, sealed or non-sealed
//	1. final
	final class Car extends Vehicle {
	}
//	class Dummy extends Car {}


//	2. non-sealed
	non-sealed class Truck extends Vehicle {
	}

	class Dummy1 extends Truck {
	}

	class Dummy2 extends Truck {
	}


//	3. Sealed
	sealed class Bike extends Vehicle permits SuperBike {
	}
	final class SuperBike extends Bike {
	}

//	class Dummy extends Vehicle {
//	}

	public static void main(String[] args) {

//		What is a Sealed Class? (Java 17) (Inheritance)
//		Only allowed subclasses (Car, Truck, Bike) can extend Vehicle.
//			Car is final, so it can't be extended further.
//			Truck is non-sealed, so any class can extend it.
//			Bike is sealed again, allowing only SuperBike to extend it.

	}

}

//Things You Should Know - Sealed Classes & Interfaces
//1. Prevents accidental subclassing & implementations permitted classes can extend or implement Only explicitly
//2. Improves readability and maintainability - Clearly defines allowed subtypes
//3. Helps enforce strict type hierarchies in large applications
//4. Subclasses/Implementations must be final, non-sealed, or sealed
