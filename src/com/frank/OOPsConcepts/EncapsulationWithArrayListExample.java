package com.frank.OOPsConcepts;

public class EncapsulationWithArrayListExample {

	public static void main(String[] args) {
	}

}
//
//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable {
//
//	// Internal storage array (Encapsulated - private)
//	private transient Object[] elementData;
//
//	// Current number of elements in the list
//	private int size;
//}


/*
 * How Data is Stored in ArrayList
 * 
 * ArrayList internally uses a dynamic array (elementData) to store elements.
 * 
 * This array is private, meaning it cannot be accessed or modified directly
 * from outside the class.
 * 
 * The size of the list is managed separately to track the number of elements.
 * 
 * ArrayList prevents direct access to elementData, ensuring safety and
 * consistency.
 * 
 * JDK Implementation (ArrayList.java):
 * 
 */
