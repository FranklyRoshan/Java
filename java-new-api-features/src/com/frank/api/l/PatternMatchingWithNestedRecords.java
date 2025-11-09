package com.frank.api.l;

// Pattern Matching with Nested Records (Java 21)
record Customer(String name, String email) {
}

record Product(String name, double price) {
}

record Order(Customer customer, Product product) {
}

public class PatternMatchingWithNestedRecords {

	public static void processOrder(Object obj) {
		if (obj instanceof Order(

	Customer (String name, String email),

	Product(String productName, double price))) {
		System.out.println("Customer " + name + " odered " + productName + " for $" + price);
		
		}

	}

	public static void main(String[] args) {
		processOrder(new Order (
				new Customer("Frank", "Email"),
				new Product("FoosBall", 100)));
	}

}
