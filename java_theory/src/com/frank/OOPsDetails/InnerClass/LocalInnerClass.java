package com.frank.OOPsDetails.InnerClass;

/*
 * Local Inner Class 
 * 
 * What?
 * A class inside a method.
 * Only accessible within the method where it is defined.
 * 
 * Use a local inner class when you need temporary,method specific logic, 
 * like generating invoices inside an order processing method without exposing the class globally.
 * 
 * Example: Defining a Class Inside a Method
 */

class Order {
	private String orderId = "ORD123";

	void processOrder() {
		// Local Inner Class
		class Invoice {
			void generateInvoice() {
				System.out.println("Generating invoice for Order ID: " + orderId);
			}
		}

		// Local Inner Class object
		Invoice invoice = new Invoice();
		invoice.generateInvoice();
	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
		Order order = new Order();
		order.processOrder();
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