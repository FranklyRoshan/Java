package com.frank.OOPsConcepts.polymorphism;

// 📌 Example: Compile-Time Polymorphism (Method Overloading)

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2.5, 3.5));
	}
}

/*
 * What is Polymorphism? #
 * 
 * 📌 Overview What?: Polymorphism allows the same method or function to behave
 * differently
 * 
 * Meaning: Comes from the Greek words "poly" (many) and "morph" (forms). 📌
 * 
 * Types of Polymorphism
 * 
 * Compile-Time Polymorphism (Method Overloading) → Decided at compile time.
 * Run-Time Polymorphism (Method Overriding) → Decided at runtime.
 */

/*
 * Key Takeaways
 * 
 * Polymorphism enables flexibility by allowing the same method call to perform
 * different actions.
 * 
 * Dynamic Method Dispatch is the mechanism for achieving runtime polymorphism
 * in Java.
 * 
 * Static Binding happens at compile time, while Dynamic Binding happens at
 * runtime.
 * 
 */