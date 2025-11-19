package com.frank.OOPsDetails;

// 📌 AbstractList class
public class EqualsWithArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


//	@Override
//	public boolean equals(Object o) {
//		if (o == this) {
//			return true;
//		}
//		if (!(o instanceof List)) {
//			return false;
//		}
//
//		ListIterator<E> e1 = ListIterator();
//		ListIterator<?> e2 = ((List<?>) o).listIterator();
//		while (e1.hasNext() && e2.hasNext()) {
//			E o1 = e1.next();
//			Object o2 = e2.next();
//			if (!(o1 == null ? o2 == null : o1.equals(o2))) {
//				return false;
//			}
//		}
//		return !(e1.hasNext() || e2.hasNext());
//	}

}

/*
 * Explanation:
 * 
 * Reference Check: If the object o is the same instance as this, it returns
 * true.
 * 
 * Type Check: It verifies that o is an instance of List.
 * 
 * Element Comparison: It uses ListIterator to traverse both lists
 * simultaneously, comparing corresponding elements using their equals() method.
 * If any pair of elements is not equal, it returns false.
 * 
 * Size Check: After the loop, if one list has more elements than the other, it
 * returns false. Otherwise, it returns true.
 * 
 */

/*
 * 📌 Best Practices for Implementing equals()
 * 
 * Reflexive → x.equals(x) must return true.
 * 
 * Symmetric → If x.equals(y), then y.equals(x).
 * 
 * Transitive → If x.equals(y) and y.equals(z), then x.equals(z).
 * 
 * Consistent → Multiple calls to x.equals(y) should return the same result
 * unless any of the objects are modified.
 * 
 * Non-null → x.equals(null) must always return false.
 * 
 * Important: Always override hashCode() when overriding equals() to ensure
 * correct behavior in collections like HashSet and HashMap
 */