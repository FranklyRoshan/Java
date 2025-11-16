package com.frank.java_memory_management;

class A {
	B b;
}

class B {
	A a;
}

public class ReferenceCountExample {

	public static void main(String[] args) {
		A a = new A(); // objA on Heap refCount = 1
		B b = new B(); // objB on Heap refCount = 1

		a.b = b; // objB on Heap refCount increases to 2
		b.a = a; // objA on Heap refCount increases to 2

		a = null; // objA on Heap refCount decreases to 1
		b = null; // objB on Heap refCount decreases to 1

		// Even though objA and objB are unreachable,
		// their refCount is still 1.

		// Lot of other code follows

	}

}

/*
 * Reference Counting
 * 
 * What? Each object has a reference counter: Tracks how many references point
 * to it When the count reaches zero, the object is eligible for garbage
 * collection.
 * 
 * Why? Simple and fast Memory can be freed immediately
 * 
 * when no references exist
 * 
 * Issue? Fails with circular references → Two objects referencing each other
 * will never be collected.
 * 
 * Example: Problem: Even though objA and objB are unreachable, their reference
 * count is still 1, preventing GC. Solution: Java does not use Reference
 * Counting
 * 
 */
