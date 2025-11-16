package com.frank.OOPsConcepts;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound...");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks...");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat meows...");
	}
}

public class InheritanceWithPolymorphismMethodOverriding {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();

		Animal myCat = new Cat();
		myCat.makeSound();
	}
}

/*
 * Method Overriding (Polymorphism)
 * 
 * What? Allows a subclass to provide a different implementation of a method.
 * 
 * Why? Enables dynamic method behavior based on object type.
 * 
 * Example: Dog and Cat override makeSound() from Animal.
 * 
 */
