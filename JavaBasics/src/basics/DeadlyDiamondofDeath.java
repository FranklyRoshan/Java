/*
 * Deadly Diamond of Death
 * 
 * Why It's called "Deadly Diamond of Death"?
 * 
 * When a class inherits from two classes that both inherit from the same
 * superclass, it forms a diamond shape in the class hierarchy.
 * 
 * This causes ambiguity:
 * If class D inherits from B and C, both B and C inherit from A, then which version
 * of A's method should D use?
 * 
 * Java Doesn't allow multiple inheritance with classes
 * Because of the deadly diamond problem, Java doesn't allow a class to extend 
 * more than one class.
 * 
 */

/*
 * Illegal Diamond Inheritance Example (will NOT Compile)

class A  {
	void show() {
		System.out.println("Class A");
	}
}

class B extends A {
	void show() {
		System.out.println("Class B");
	}
}

class c extends A {
	void show() {
		System.out.println("Class C");
	}
}

// Error: Java does NOT support multiple inheritance
//Class D extends B,C {
//	void display() {
//		System.out.println("Class D");
//	}
//}

*/

package basics;

/*
 * Solving Diamond Problem with interfaces
 * Java solves this using interfaces.
 */

interface A {
	void show();
}

class B implements A {
	public void show() {
		System.out.println("Class B");
	}
}

class C implements A {
	public void show() {
		System.out.println("Class C");
	}
}

class D implements A {
	B b = new B();
	C c = new C();
	
	public void show() {
		System.out.println("Class D - Resolvinng Deadly Diamond of Death Problem.");
		b.show();
		c.show();
	}
}

public class DeadlyDiamondofDeath {

	public static void main(String[] args) {
		D obj = new D();
		obj.show();
	}

}
