package com.frank.OOPsDetails;

import java.util.Iterator;
import java.util.NoSuchElementException;

// 1. Define a class to hold the toString() method and generic type <E>
class DummyCollection<E> {

	// 2. Implement a dummy iterator() method the toString() code relies on
	public Iterator<E> iterator() {
		// We return a simple iterator that immediately says it has no elements.
		return new Iterator<>() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public E next() {
				throw new NoSuchElementException();
			}
		};
	}

	// 3. The user's provided toString() implementation, now in the correct scope.
	@Override
	public String toString() {
		Iterator<E> it = iterator();
		if (!it.hasNext()) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (;;) {
			E e = it.next();
			sb.append(e == this ? "(this Collection)" : e);
			if (!it.hasNext()) {
				return sb.append(']').toString();
			}
			sb.append(',').append(' ');
		}
	}
}

public class ToStringWithArrayList {

	public static void main(String[] args) {
		// Instantiate the class containing the method
		DummyCollection<String> dummy = new DummyCollection<>();

		// This executes the toString() method you provided.
		System.out.println("Result of calling toString(): " + dummy.toString());
	}
}

/*
 * Best Practices for Overriding toString():
 * 
 * Provide Meaningful Information: Include relevant details about the object's
 * state to aid in debugging and logging.
 * 
 * Ensure Consistency: The string representation should be consistent with the
 * object's state and behavior.
 * 
 * Avoid Sensitive Information: Do NOT include confidential data in the
 * toString() output.
 */