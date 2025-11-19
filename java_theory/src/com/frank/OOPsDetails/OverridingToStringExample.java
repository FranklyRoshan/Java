package com.frank.OOPsDetails;

//📌 Example: Overriding toString() for Better Readability

class Bird {
	private String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bird {name =' " + name + "'}";
//		return this.name;
	}

	/*
	 * toString() Implementation in String Class:
	 * 
	 * public String toString()
	 * 
	 * { return this; //Returns the string itself }
	 * 
	 */
}

public class OverridingToStringExample {

	public static void main(String[] args) {

		Bird swifts = new Bird("Bella");

		// Output: Bird{name='Bella'}
		System.out.println(swifts);
	}


}
