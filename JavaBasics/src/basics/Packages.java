/*
 * Java Packages
 * What is a Package?
 * 
 * A Package is a namespace that organize a set of related classes and interfaces.
 * Conceptually, it's similar to folders on your computer.
 * 
 * Java provides:
 * 		Built-in package (like java.util.java.io, etc.)
 * 		User-defined package (you create your own)
 * 
 * Types of packages
 * 		Built-in packages
 * 			Provided by Java
 * 			Example: java.util, java.io, java.lang
 * 		User-defined package
 * 			Created by you to structure your programs
 * 
 * Benefits of packages
 * 		Avoid name conflicts
 * 		Control access
 * 		Easier to locate and use classes
 * 		Improve maintainability
 */

package basics;

public class Packages {

	public static void main(String[] args) {
		CalculatorExampleForPackage calc = new CalculatorExampleForPackage();
		System.out.println("Sum = " + calc.add(10, 20));
	}

}
