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
 * 
 * In Hierarchical Inheritance, multiple classes inherit form a single parent class
 * 
 */

package basics;

class AnimalKingdom {
	void breathe() {
		System.out.println("Animals breathe oxygen");
	}
}

class Feline extends AnimalKingdom {
	void meow() {
		System.out.println("Feline species meow");
	}
}

class Canids extends AnimalKingdom {
	void bark() {
		System.out.println("Canids species bark");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Canids dog = new Canids();
		dog.breathe();
		dog.bark();
		
		Feline cat = new Feline();
		cat.breathe();
		cat.meow();
	}

}
