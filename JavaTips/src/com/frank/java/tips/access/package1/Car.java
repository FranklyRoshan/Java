package com.frank.java.tips.access.package1;

//File: com/example/Car.java
public class Car {
	void display() {
		System.out.println("Car class");
	}
}

//File: com/example/Engine.java
class Engine { // No modifier → package-private
	void start() {
		System.out.println("Engine started");
	}
}

/*
 * ✅ Car can be accessed from any package.
 * 
 * ❌ Engine can only be accessed by other classes in the com.example package.
 */

/*
 * 🧩 1. Access Modifiers for Top-Level Classes
 * 
 * There are only two possible access modifiers:
 * 
 * | Modifier | Description | Accessible From |
 * 
 * | **`public`** | The class is visible to **all other classes** in **all
 * packages**. | Anywhere in the project. |
 * 
 * | *(default)* (no modifier) | Called **package-private** — the class is
 * visible **only within the same package**. | Only within the same package. |
 * 
 * 
 */
