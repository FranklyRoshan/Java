/*
 * Polymorphism
 * 
 * Polymorphism means "many forms". In Java, it allows objects to behave differently 
 * based on their class type, even if they share the same interface or superclass.
 * 
 * Types of Polymorphism:
 * 		Complie-time Polymorphism (Method Overloading)
 * 		Runtime Polymorphism (Method Overriding)
 * 
 * Compile-time Polymorphism (Method Overloading)
 * 		Same method name, different parameter list (number or type of arguments).
 * 
 * Runtime  Polymorphism (Method Overloading)
 * 		A subclass provides a specific implementation of a method already defined in its superclass
 */

package basics;

// Parent class
class Fauna {
	// Compile-time polymorphism: method overloading
	void sound() {
		System.out.println("Animal make a sound");
	}
	
	void sound (String type) {
		System.out.println("Animal makes a " + type + " sound");
	}
	
	// Runtime polymorphism: this method will be overridden
	void eat() {
		System.out.println("Animal eats food");
	}
}


// Subclass
class Canines extends Fauna {
	// Overriding the eat() method
	@Override
	void eat() {
		System.out.println("Dogs eats bones");
	}
 }
public class Polymorphism {

	public static void main(String[] args) {
		// Complie-time polymorphism
		Fauna a1 = new Fauna();
		a1.sound();				// Calls sound()
		a1.sound("roaring");	// Calls overload sound(String)
		
		// Runtime polymorphism
		Fauna a2 = new Canines(); // Upcasting
		a2.eat();			   // Calls Dog's eat() due to dynamic binding
	}

}
