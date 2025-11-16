package com.frank.java_memory_management;

class Name {
	public String name;
}

public class CallByReferenceExample {

	static void modify(Name p) {
		p.name = "Alice"; // Modifies the object

		// p = new Person();
		// Does
	}

	public static void main(String[] args) {
		Name person = new Name();
		person.name = "Bob";
		modify(person);
		System.out.println(person.name);
		// Output: Alice (object modified)
	}

}

/*
 * Passing Objects in Java: Also Call by Value
 * 
 * What? When an object is passed, the reference is copied, not the actual
 * object.
 * 
 * Why? The reference itself cannot be changed, but the object's internal values
 * can be modified.
 */