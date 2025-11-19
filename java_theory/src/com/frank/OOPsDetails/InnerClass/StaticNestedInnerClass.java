package com.frank.OOPsDetails.InnerClass;

/*
 * Static Nested Class
 * What?
 * A static inner class does not require an instance of the outer class.
 * Can only access static members of the outer class.
 * Use when an inner class does not need access to instance variables of the outer class.
 * When you need a helper class that groups related functionality, like a Database.
 * Connection class managing database connections without needing an outer class instance.
 */

class Database {
	private static String url = "jdbc:mysql://localhost:3306/mydb";

	// Static Nested Class
	static class Connection {
		void connect() {
			// Can access only static members
			System.out.println("Connecting to: " + url);
		}
	}
}

public class StaticNestedInnerClass {
	public static void main(String[] args) {
		// No outer class object needed
		Database.Connection connection = new Database.Connection();

		connection.connect();
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