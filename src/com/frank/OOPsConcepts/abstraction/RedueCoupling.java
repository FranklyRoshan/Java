package com.frank.OOPsConcepts.abstraction;

// How to Reduce Coupling in Java? #

/*📌 1: Use Interfaces and Dependency Injection
 * Bad Example (Tight Coupling)
 * Car is tightly coupled to Engine.
 * If Engine changes or a new engine type is needed, Car must also change.
 */

//
//class Engine {
//	void start() {
//		System.out.println("Engine starting...");
//	}
//}
//
//class Car {
//	// Direct dependency
//	private Engine engine = new Engine();
//
//	void drive() {
//		engine.start();
//		System.out.println("Car is driving...");
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Car car = new Car();
//		car.drive();
//	}
//
//}
/*
 * Good Example (Loose Coupling - Using Interfaces and DI)
 * Car depends on Engine interface, not a specific implementation.
 * Easily switch engines without modifying Car.
 */
	interface Engine {
		void start();
	}

	class PetrolEngine implements Engine {
		@Override
		public void start() {
			System.out.println("Petrol engine starting...");
		}
	}

	class DieselEngine implements Engine {
		@Override
		public void start() {
			System.out.println("Diesel engine starting...");
		}
	}

	class Car {
		private Engine engine;

		// Constructor injection (Dependency Injection)
		public Car(Engine engine) {
			this.engine = engine;
		}

		void drive() {
			engine.start();
			System.out.println("Car is driving...");
		}
	}

	public class RedueCoupling {
		public static void main(String[] args) {
			Engine petrol = new PetrolEngine();
			Car car1 = new Car(petrol);
			car1.drive();

			Engine diesel = new DieselEngine();
			Car car2 = new Car(diesel);
			car2.drive();
		}
	}
