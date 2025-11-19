package com.frank.OOPsDetails;

/*
 * What?
 * Default methods in an interface are methods with a body (implementation).
 * Introduced in Java 8 using the default keyword.
 * 
 * Why?
 * Helps in achieving backward compatibility:
 * Allows adding new methods to interfaces without breaking existing code.
 * Provides a default implementation that classes can override.
 * Example:
 */

interface Fan {
		void turnOn();

		// Default Method
		default void showStatus() {
			System.out.println("Fan is running");
		}
	}

	class CeilingFan implements Fan {
		@Override
		public void turnOn() {
			System.out.println("Ceiling Fan is ON");
		}
	}

	public class DefaultMethodsInAnInterface {
		public static void main(String[] args) {
			CeilingFan fan = new CeilingFan();
			fan.turnOn();
			fan.showStatus(); // Calls default method
		}
}

