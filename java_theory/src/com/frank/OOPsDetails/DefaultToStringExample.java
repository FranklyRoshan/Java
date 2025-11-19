package com.frank.OOPsDetails;

/*
 * The toString() method provides a string representation of an object.
 * By default, it prints ClassName@hashcode.
 */

//public String toString() {
//    return getClass().getName() 
//            + "@" + Integer.toHexString(hashCode());
//}


// Best Practice: Override toString() to return meaningful information about the object
// 📌 Example: Default toString() Behavior

class Mammal {
	private String name;

	public Mammal(String name) {
		this.name = name;
	}
}

public class DefaultToStringExample {

	public static void main(String[] args) {
		Mammal dog = new Mammal("Tommy");

		// Output: Mammal@<hashcode>
		System.out.println(dog);
	}

}
