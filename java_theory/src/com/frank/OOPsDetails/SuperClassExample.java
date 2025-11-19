package com.frank.OOPsDetails;

/*
 * What is the superclass of every class in Java? 
 *
 * In Java, the superclass of every class is the Object class.
 * 
 * All Java classes implicitly inherit from Object - even if not explicitly specified.
 * 
 * The Object class provides common methods that all Java objects inherit.
 * toString() → Returns a string representation of the object.
 * equals() → Compares two objects for equality.
 * hashCode() → Returns a unique integer (hash code) for the object.
 * Few other methods related to synchronization that we will discuss later!
 * 
 * 📌 Example: Using Object Methods
 */

public class SuperClassExample {

	public static void main(String[] args) {
		Object obj = new Object();

		// Outputs: java.lang.Object@<hashcode>
		System.out.println(obj.toString());
	}

}
