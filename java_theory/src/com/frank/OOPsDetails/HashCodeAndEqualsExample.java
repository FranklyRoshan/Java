package com.frank.OOPsDetails;


/*📌 Overview
Purpose: Generates a unique integer (hash code) for an object.
Why?: Used in hashing-based collections like HashMap, HashSet, and HashTable.
Key Rule: If two objects are equal (equals() returns true), they must have the same hashCode().
*/
/*📌 Objects.hash() Method
Static method in Objects class
Provides a simple way to compute a hash code based on multiple fields of an object
Commonly used when overriding the hashCode() method
public static int hash(Object... values)
//return Objects.hash(name, age);
📌 Example: Overridden hashCode()*/
//import java.util.Objects;
//
//class Animal {
//    private String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
//}

// 📌 Example with both hashCode and equals
import java.util.Objects;

class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
			return true;
		}
        
        if (obj == null 
            || getClass() != obj.getClass()) {
			return false;
		}
        
        Animal animal = (Animal) obj;
        
        return age == animal.age &&
               Objects.equals(name, animal.name) &&
               Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species);
    }

}

public class HashCodeAndEqualsExample {
	public static void main(String[] args) {
		Animal a1 = new Animal("Leo", 5, "Lion");
		Animal a2 = new Animal("Leo", 5, "Lion");
		Animal a3 = new Animal("Simba", 3, "Lion");

		System.out.println(a1.hashCode()); // Same as a2
		System.out.println(a2.hashCode()); // Same as a1
		System.out.println(a3.hashCode()); // Different
		System.out.println(a1.equals(a2)); // true
		System.out.println(a1.equals(a3)); // false
	}
}