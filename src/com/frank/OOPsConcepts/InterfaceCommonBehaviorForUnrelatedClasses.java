package com.frank.OOPsConcepts;

/*
 * Defining Common Behavior for Unrelated Classes
 * 
 * What? Different classes that should share the same behavior.
 * 
 * Example: Flyable interface for birds and airplanes.
 * 
 */

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Bird flaps its wings to fly.");
	}
}

class Airplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("Airplane flies using engines.");
	}
}

public class InterfaceCommonBehaviorForUnrelatedClasses {
	public static void main(String[] args) {
		Flyable bird = new Bird();
		bird.fly();

		Flyable plane = new Airplane();
		plane.fly();
	}
}

