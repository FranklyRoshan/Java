package com.frank.OOPsConcepts.polymorphism;

/*📌 Example: Sealed Interface
 * 
 * Controls which classes can implement Animal.
 * 
 * Dog is final, so no other class can extend it.
 * 
 * Bird is non-sealed, so any class can implement it.
 * 
 * Cat is sealed, so only PersianCat can extend it.
 */

sealed interface Animals permits Dogs, Cats, Birds {
}

// Cannot be extended  
final class Dogs implements Animals {
}

// Restricted to PersianCat  
sealed class Cats implements Animals permits PersianCat {
}

// Can be freely extended  
non-sealed class Birds implements Animals {
}

// No further subclassing  
final class PersianCat extends Cats {
}

public class SealedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * 📌 Summary:
 * 
 * Java New Feature: Introduced in Java 17 Restricts
 * 
 * Inheritance: Only specified classes can extend or implement. Prevents
 * Unwanted
 * 
 * Subclassing: No accidental extensions.
 * 
 * Improves Maintainability: Clearer type hierarchy.
 */


