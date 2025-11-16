package com.frank.OOPsConcepts;

/*
 *Operations Defined Without Direct Access to Data
 *
 *Since elementData is private, Java provides public methods to safely modify and access elements.
 *
 *These methods validate inputs, manage memory, and prevent illegal operations.
 *
 *Example Operation: Adding Elements (add())
 *
 *The add() method increases the size of ArrayList and stores the element safely.
 *
 *Ensures capacity before adding a new element.
 *
 *Users can only add elements through add(), preventing direct modification of elementData
 */

//public boolean add(E e) {
//    
//    // Check if array needs resizing
//    ensureCapacityInternal(size + 1); 
//    
//    // Store element safely
//    elementData[size++] = e; 
//    
//    return true;
//
//}
//
//// Ensures there is enough space for new elements
//private void ensureCapacityInternal(int minCapacity) {
//
//    if (minCapacity - elementData.length > 0) {
//        // Increases array size if needed
//        grow(minCapacity); 
//    }
//
//}

/*
 *Accessing Elements (get())
 *The get() method retrieves an element from elementData while checking for valid indexes.
 */

//public E get(int index) {
//    rangeCheck(index); // Validate index
//    return (E) elementData[index]; // Return element
//}
//
//// Ensures index is within valid range
//private void rangeCheck(int index) {
//    if (index >= size)
//        throw new IndexOutOfBoundsException();
//}

public class EncapsulationWithOperationsWithoutDirectAccessToData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

