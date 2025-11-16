package com.frank.java_memory_management;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}
}

public class HeapMemoryExample {

	public static void main(String[] args) {
		// `p1` in Stack, object in Heap
		Person p1 = new Person("Alice");

		// Another object in Heap
		Person p2 = new Person("Bob");

		// A very long program follows!
		// A very long program follows!
		// A very long program follows!

	}

}

/*
 * Heap Memory
 * 
 * What? Stores objects.
 * 
 * Why? Needed for objects where object lifespan is unknown.
 * 
 * Code Example p1 and p2 references are in Stack, but objects exist in Heap.
 * Objects persist even after the method call ends, until GC removes them.
 * 
 */
