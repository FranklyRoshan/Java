package com.frank.CoreJava;

// 📌 Records Are Immutable
record User(String name, String email) {
	// Note: The fields are automatically final and cannot be reassigned.
}

// 📌 Cannot Add Instance Variables (Dummy record to illustrate the constraint)
record Product(String name, double price) {
	// private int discount; // Compilation Error if uncommented
}

// 📌 Good to Know: Simple Record Pattern Matching (Java 21)
record Course(int id, String name) {}

// 📌 Good to Know: Nested Record Pattern Matching (Java 21)
record Address(String street, String city) {
}

// NOTE: Changed to use the defined 'User' record instead of undefined 'Person'
record Contact(User user, Address address) {
}


public class RecordProperties {

	// Method demonstrating simple pattern matching - MOVED INSIDE THE CLASS
	public static void processCourse(Object obj) {
		if (obj instanceof Course(int id, String name)) {
			System.out.println("Course ID: " + id + ", Name: " + name);
		} else {
			System.out.println("Object is not a Course record.");
		}
	}

	// Method demonstrating nested pattern matching - MOVED INSIDE THE CLASS
	public static void processContact(Object obj) {
		// FIXED: Pattern matching to use 'User' and its fields 'name' and 'email'
		if (obj instanceof Contact(User(var name, var email), // Pattern matching binds 'name' and 'email'
		Address(var street, var city))) {

			// We use the 'name' and 'city' variables bound by the pattern match
			System.out.println(name + " lives in " + city);
		} else {
			System.out.println("Object is not a valid Contact record.");
		}
    }


	public static void main(String[] args) {
        
        System.out.println("--- 1. Immutability & Mutability Check ---");
		
        // Example of Immutability
		User p = new User("Alice", "alice@example.com");
		System.out.println("User (Record): " + p);
        
        // Example of When NOT to use Records (Mutable Object)
        BankAccount account = new BankAccount(100.00);
        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(50.00);
        System.out.println("Balance after deposit: $" + account.getBalance());
        
        System.out.println("\n--- 2. Pattern Matching (Java 21) ---");

        // Simple Pattern Matching Example
        Course javaCourse = new Course(101, "Core Java");
        System.out.print("Simple Match: ");
        processCourse(javaCourse);
        
		// Nested Pattern Matching Example
		User contactUser = new User("Frank", "frank@example.com");
        Address contactAddress = new Address("Main St", "New York");
		Contact fullContact = new Contact(contactUser, contactAddress);
        
        System.out.print("Nested Match: ");
        processContact(fullContact);

	}

}

/*
 * Summary: Records introduced in JDK 16
 * 
 * Advanced Pattern Matching in JDK 21
 * 
 */
