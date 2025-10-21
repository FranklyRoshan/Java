package com.example.java;

public class JavaLangDefaultPackage {

	public static void main(String[] args) {
		// Using System class
		System.out.println("Hello from java.lang!");

		// Using Math class
		double result = Math.sqrt(16);
		System.out.println("Square root of 16: " + result);

		// Using String class
		String msg = "Java";
		System.out.println("Uppercase: " + msg.toUpperCase());

		// Using Wrapper class
		int number = 42;
		System.out.println("Integer value: " + number);

		// Using Object class methods
		JavaLangDefaultPackage obj = new JavaLangDefaultPackage();
		System.out.println("Object hash code: " + obj.hashCode());
	}

}

/*
 * ☕ What is java.lang? java.lang is a core Java package that contains
 * fundamental classes essential for the Java language. It’s automatically
 * imported into every Java program — so you don’t need to write
 * 
 * import java.lang.*; explicitly (it’s done by default).
 * 
 * 🧩 Think of it like this: java.lang = the foundation of all Java programs.
 * 
 * It provides: Basic data type wrappers Math operations String manipulation
 * Threading Exception handling Object class (the parent of all Java classes)
 * 
 * 📦 Common Classes Inside java.lang Class Name Purpose / Description Object
 * Superclass of all Java classes (every class implicitly extends this). String
 * Represents a sequence of characters. StringBuilder, StringBuffer Mutable
 * versions of strings. Math Provides mathematical functions (sqrt(), pow(),
 * abs(), etc.). System Used for system-level operations like
 * System.out.println(), input/output, and environment access. Thread, Runnable
 * Used for multithreading. Exception, Error, Throwable Root classes for
 * exception handling. Integer, Double, Float, Character, Boolean, etc. Wrapper
 * classes for primitive types. Class Represents metadata of a class (used in
 * Reflection). Enum Base class for all enumerations. Runtime Represents the JVM
 * runtime environment. 💡 Example Usage (all from java.lang)
 *
 *
 * 🔑 Key Takeaways Concept Description Auto-imported java.lang is imported by
 * default into every Java program Core utilities Includes fundamental classes
 * for math, strings, system, and objects No explicit import needed You can
 * directly use System, String, Math, etc. Backbone of Java Without it, Java
 * programs can’t even compile properly
 * 
 */