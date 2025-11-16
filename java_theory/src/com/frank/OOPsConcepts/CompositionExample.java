package com.frank.OOPsConcepts;

/*Inheritance and composition are two options to reuse code
 * 
 * However, composition is generally preferred unless there is a clear "IS-A" relationship.
 * 
 * Why? Provides greater flexibility, Reduces tight coupling between classes

📌 What is Composition?
Composition: "has-a" relationship where an object contains another object
Allows objects to delegate behavior to other objects rather than inheriting behavior from a parent class.

📌 Bad Example For Inheritance
*/
//class Engine {
//	public void start() {
//		System.out.println("Engine is starting...");
//	}
//}
//
//class Car extends Engine {
//	public void drive() {
//		System.out.println("Car is driving...");
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Car myCar = new Car();
//		myCar.start(); // Inherited from Engine
//		myCar.drive();
//	}
//	
//}

/*	Problems with the Above Approach
Incorrect Relationship:
A Car is not a type of Engine, but it has an engine.

Using inheritance (extends Engine) creates an incorrect "IS-A" relationship instead of a "HAS-A" relationship.
Unnecessary Method Inheritance: Every method in Engine is automatically inherited by Car, even if it doesn't logically belong to a car.
Example: If Engine has a

	method changeOil(), Car will inherit it, even though a car itself does not change oil—the engine does.
Limited Flexibility & Maintainability: What if we need to support multiple engine types like PetrolEngine or ElectricEngine?
With inheritance, we'd have to create multiple

Car subclasses (PetrolCar, ElectricCar), making the system harder to extend and maintain.
A better approach is to use composition, where a Car contains an Engine object and delegates operations to it.
Better Approach: Composition
*/

class Engine {
    public void start() {
        System.out.println("Engine is starting...");
    }
}

class Carss {
    // Composition: Car has an Engine
    private Engine engine; 

	public Carss(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        // Delegating behavior to Engine
        engine.start(); 
        System.out.println("Car is driving...");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
		Carss myCar = new Carss(myEngine);
        myCar.drive();
    }
}

/*
 * Use inheritance only when there is a true "is-a" relationship (e.g., Dog
 * extends Animal).
 * 
 * Use composition for "has-a" relationships (e.g., Car has an Engine).
 * 
 * Avoid deep inheritance trees – They make code hard to maintain and
 * understand.
 * 
 */