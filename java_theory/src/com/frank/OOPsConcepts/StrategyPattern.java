package com.frank.OOPsConcepts;

interface Sortable {
	public int[] sort(int[] numbers);
}

class BubbleSort implements Sortable {
	@Override
	public int[] sort(int[] numbers) {
		return numbers; // LOGIC GOES HERE
	}
}

class QuickSort implements Sortable {
	@Override
	public int[] sort(int[] numbers) {
		return numbers; // LOGIC GOES HERE
	}
}

class ComplexClass {
	private Sortable sorter;

	ComplexClass(Sortable sorter) {
		this.sorter = sorter;
	}

	void doAComplexThing() {
		int[] values = null;

		// logic...

		sorter.sort(values);

		// logic...
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		ComplexClass complexClassInstance = new ComplexClass(new BubbleSort());
		complexClassInstance.doAComplexThing();
	}
}


/*
 * What are Design Patterns?
 * 
 * What? Reusable solutions for common coding problems.
 * 
 * Why? Makes code easier to understand, change, and reuse.
 * 
 * Where? Used in big projects, frameworks, and everyday coding.
 *
 * How? By applying proven patterns like Singleton, Strategy, Factory, and
 * Observer.
 * 
 */

/*
 * Example 2: Strategy Pattern
 * 
 * What? Swap different algorithms at runtime.
 * 
 * When? Want to choose behavior dynamically (Bubble vs Quick sort).
 * 
 * How? Interface for strategy + pass concrete implementation.
 * 
 * Sortable sorter = new BubbleSort(); // or QuickSort
 * 
 * ComplexClass task = new ComplexClass(sorter);
 * 
 * task.doAComplexThing();
 */
