package com.frankly.oops.inheritance;

// Polymorphism
abstract class Animal {
	abstract void vocalization();
}

class Dog extends Animal {
	@Override
	public void vocalization() {
		System.out.println("Barks");
	}
}

class Cat extends Animal {
	@Override
	public void vocalization() {
		System.out.println("Meows");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.vocalization();
		}
	}

}
