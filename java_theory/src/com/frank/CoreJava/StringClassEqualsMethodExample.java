package com.frank.CoreJava;

// 📌Overview Purpose:Used to compare two objects for equality.
// Default Behavior:Compares memory addresses of the objects(same as==).
//  Object Class:Returns true only if both references point to the same object 
// public boolean equals(Object obj){return(this==obj);}

// 📌String class equals method:

public class StringClassEqualsMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public boolean equals(Object anObject) {
//		if (this == anObject) {
//			return true;
//		}
//		if (anObject instanceof String) {
//			String aString = (String) anObject;
//			int n = value.length;
//			if (n == aString.value.length) {
//				char[] v1 = value;
//				char[] v2 = aString.value;
//				int i = 0;
//				while (n-- != 0) {
//					if (v1[i] != v2[i]) {
//						return false;
//					}
//					i++;
//				}
//				return true;
//			}
//		}
//		return false;
//	}

}

/*
 * Explanation:
 * 
 * Reference Check: If both references point to the same object (this ==
 * anObject), it returns true.
 * 
 * Type Check: It verifies that the passed object is an instance of String.
 * 
 * Content Comparison: It compares the lengths and corresponding characters of
 * the two strings.
 */