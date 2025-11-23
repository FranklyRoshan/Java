package com.frank.CoreJava;

import java.util.Objects;

//1. Define the Record class (Must be outside the main class)
//This implements the concise version of the Person data structure.
//public record Person(String name, String email, String phoneNumber) {
//}

// 1. 📌 Use Records for Immutable Data (DTO Example)
record UserDTO(String username, String role) {
}

// 2. 📌 Add Custom Validation in Compact Constructors
record Persons(String name, String email) {

	// Compact Constructor: Runs automatically after component initialization
	// Used here for validation.
	public Persons {
		// Use Objects.requireNonNull for null checks (best practice)
		Objects.requireNonNull(name, "Name must not be null");
		if (name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be empty or blank.");
		}
		// Note: 'this.name = name;' is automatically generated
	}

}

// 3. 📌 Use Methods for Additional Functionality (Derived Values)
record Rectangle(int width, int height) {

	public int area() {
		return width * height; // Calculates derived value
	}

}

// 4. 📌 Use Static Fields and Methods When Needed
record Car(String model, int year) {

	// Static Field (allowed)
	private static final String MANUFACTURER = "Tesla";

	// Static Method (allowed)
	public static String getManufacturer() {
		return MANUFACTURER;
	}

}

public class TheBestPracticesWithRecords {

	public static void main(String[] args) {

		System.out.println("What are the best practices with Records? #\n");

		// --- 1. User DTO Example ---
		UserDTO user = new UserDTO("frank_coder", "admin");
		System.out.println("1. Immutable Data (DTO): " + user);

		// --- 2. Compact Constructor Validation Example ---
		try {
			// This should succeed
			Persons validPerson = new Persons("Alice", "alice@example.com");
			System.out.println("\n2. Validation Success: " + validPerson);

			// This should fail and throw an exception
			// Person invalidPerson = new Person("", "a@b.com"); // Uncomment to test
			// failure
		} catch (IllegalArgumentException e) {
			System.err.println("\n2. Validation Failure (Caught Exception): " + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("\n2. Validation Failure (Caught Exception): " + e.getMessage());
		}

		// --- 3. Custom Instance Method Example ---
		Rectangle rect = new Rectangle(5, 10);
		System.out.println("\n3. Instance Method (Area):");
		System.out.print("Rectangle: " + rect + " | ");
		System.out.println("Area: " + rect.area()); // Output: 50

		// --- 4. Static Field/Method Example ---
		Car myCar = new Car("Model 3", 2023);
		System.out.println("\n4. Static Field/Method:");
		System.out.println("Car: " + myCar);
		System.out.println("Manufacturer (Static Method): " + Car.getManufacturer());

	}

}