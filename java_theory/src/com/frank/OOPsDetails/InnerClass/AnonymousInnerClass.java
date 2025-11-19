package com.frank.OOPsDetails.InnerClass;

/* 
 * Anonymous Inner Class
 * What?
 * A class without a name.
 * Defined and instantiated in one step.
 * Use when only a single-use implementation is needed.
 * Example: Implementing an Interface Without Creating a Separate Class
 */

interface Fan {
	void turnOn();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		// Anonymous Inner Class
		Fan fan = new Fan() {
			@Override
			public void turnOn() {
				System.out.println("Fan is turning on...");
			}
		};

		fan.turnOn();
	}
}

/*
 * 📌 When to Use What?
 * 
 * Member Inner Class → Use when an employee’s salary calculation logic is
 * tightly coupled with the Employee class (needs full access to outer class
 * members).
 * 
 * Static Nested Class → Use when a Database.Connection class manages
 * connections independently of the Database instance (does not need instance
 * variables of the outer class).
 * 
 * Local Inner Class → Use when an Order class needs an Invoice generator inside
 * its processOrder() method (used only within a specific method).
 * 
 * Anonymous Inner Class → Use when handling a button click event in a GUI
 * application (needed only once, for immediate use).
 * 
 */