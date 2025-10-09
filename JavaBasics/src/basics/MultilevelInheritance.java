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

class Animals {
	void eat() {
		System.out.println("Animals eat food");
	}
}

class Mammals extends AnimalKingdom {
	void walk() {
		System.out.println("Mammals walk on land");
	}
}

class Dogs extends Mammals {
	void bark() {
		System.out.println("Dogs bark");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.eat();	// From Animal
		dog.walk(); // From Mammal
		dog.bark(); // From Dog
	}

}
