/*
 * Inheritance
 * 
 * Inheritance is one of the core  concepts of OOP. It allows a class (Child/derived) to 
 * inherit properties and methods form another class (parent/base).
 * 
 * Why Use Inheritance?
 * 
 * Code reusability: Avoid repeating common code
 * Organize hierarchy: Define relationship like is-a
 * Extend functionality
 * 
 * Types of Inheritance in Java
 * 		Single Inheritance
 * 		Multilevel Inheritance
 * 		Hierarchical Inheritance
 * 
 *  Java doesn't support multiple inheritance with classes (but supports it with interfaces)
 * 
 */

package basics;

class Animal {
	void sound() {
		System.out.println("Animal make sounds");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound(); // Inherited method
		d.bark();  // Child method
	}

}
