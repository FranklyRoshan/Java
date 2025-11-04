package com.frank.java.tips;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int hashscode() {
		return id; // using id as hashcode
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (this == null || getClass() != obj.getClass()) {
			return false;
		}
		Student s = (Student) obj;
		return id == s.id && name.equals(s.name);
	}
}

public class HashCode {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Frank");
		Student s2 = new Student(1, "Frank");

		System.out.println(s1.hashCode()); // 1
		System.out.println(s2.hashCode()); // 1
		System.out.println(s1.equals(s2)); // true

	}

}

/*
 * In Java, the hashCode() method is used to return an integer value (called a
 * hash code) that represents an object. It’s mainly used in hash-based
 * collections like HashMap, HashSet, and Hashtable to efficiently store and
 * retrieve objects.
 * 
 * 🔹 Definition:
 * 
 * The hashCode() method is defined in the Object class:
 * 
 * public int hashCode()
 * 
 * 
 * This means every Java object has a hash code value by default.
 * 
 * 
 * 🔹 Purpose of hashCode()
 * 
 * It helps Java decide where to store an object in hash-based data structures.
 * When you insert an object into a HashMap or HashSet, Java uses:
 * 
 * The object’s hashCode() to find a “bucket”.
 * 
 * The equals() method to check if two objects in the same bucket are equal.
 * 
 * 
 * 🔹 Key Contract Between equals() and hashCode()
 * 
 * If two objects are equal (obj1.equals(obj2) returns true), → they must have
 * the same hashCode() value.
 * 
 * If two objects have the same hashCode(), → they might or might not be equal
 * (collision can happen).
 * 
 * If two objects are not equal, → they can have the same or different hash
 * codes.
 * 
 * 
 * 🔹 Default Behavior
 * 
 * If you don’t override hashCode(), the default implementation in the Object
 * class returns a unique integer (usually based on the memory address). That’s
 * why you must override hashCode() when you override equals().
 * 
 * 
 * | Collection Type | Uses `hashCode()`? | Purpose |
 *
 * | `HashMap` | ✅ Yes | To find where to store/retrieve key-value pairs |
 *
 * | `HashSet` | ✅ Yes | To avoid duplicate elements |
 *
 * | `Hashtable` | ✅ Yes | Similar to `HashMap` |
 *
 */