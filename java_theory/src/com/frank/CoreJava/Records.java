package com.frank.CoreJava;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Records eliminate boilerplate code in Java Beans by automatically generating:
 * Constructor
 * Getters (accessors)
 * toString(), equals(), and hashCode()
 * Makes code more readable and maintainable.
 */


public class Records {

	public static void main(String[] args) {

		System.out.println("--- 1. Local Variable Type Inference (Java 10) ---");

		// Example 1: No need to repeat ArrayList<String>
		// Inferred as ArrayList<String>
		var numbers = new ArrayList<String>();
		numbers.add("One");
		numbers.add("Two");

		System.out.println("Inferred type (ArrayList): " + numbers);

		// Example 2: Inferred as HashMap<Integer, String>
		var map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");

		System.out.println("Inferred type (HashMap): " + map);

		System.out.println("\n--- 2. Records Conciseness (Java 16) ---");

		// Instantiate the Person record
		Person person = new Person(
		                    "John Doe", 
		                    "john@example.com", 
		                    "1234567890");

		// Auto-generated toString()
		System.out.println("Auto-generated toString(): " + person);

		// Auto-generated accessor (No need for getName(), use name())
		System.out.println("Access Name (person.name()): " + person.name());

		// Auto-generated accessor (No need for getEmail(), use email())
		System.out.println("Access Email (person.email()): " + person.email());

	}

}