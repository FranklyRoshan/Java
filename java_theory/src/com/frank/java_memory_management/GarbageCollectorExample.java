package com.frank.java_memory_management;

class Demo {
	private int num;

	Demo(int num) {
		this.num = num;
	}
}

public class GarbageCollectorExample {

	public static void main(String[] args) {
		// Memory allocated
		Demo demo = new Demo(10);

		System.out.println("Demo: " + demo);

		// No need to manually free memory
		// Once there are no references to an object
		// GC will free the memory

	}

}

/*
 * Automatic Garbage Collection in Java
 * 
 * What?: Java manages memory automatically, reclaiming unused objects.
 * 
 * How?: The Garbage Collector (GC) runs periodically to free up memory.
 * 
 * Example (Java: No Manual Freeing Needed)
 * 
 */