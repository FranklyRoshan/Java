package com.frankly.oops.interfaceClass;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird Wings");
	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("Aeroplane Wings");
	}

}

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
		
//		Flyable object1 = new Bird();
//		Flyable object2 = new Aeroplane();
//		object1.fly();
//		object2.fly();
		
	}
}
