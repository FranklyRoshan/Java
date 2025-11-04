package com.frank.java.tips;

import java.util.Objects;

class Client {

	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	// equals
	// hashcode

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Client other = (Client) obj;
		return id == other.id;
	}

}

public class EqualsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client(1);
		Client c2 = new Client(1);
		Client c3 = new Client(2);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

	}

}

/*
 * In Java, the equals method is used to compare the content of two objects for
 * logical equality, unlike the == operator, which checks if two references
 * point to the same object in memory.
 * 
 * For String objects, the equals method (overridden from the Object class)
 * returns true if both strings contain the exact same sequence of characters,
 * regardless of whether they are stored in the same memory location.
 * 
 * 
 * Key Points:
 * 
 * == checks reference equality (if they are the same object).
 * 
 * equals() checks value equality (if they have the same content).
 * 
 * equals() is case-sensitive.
 * 
 * Calling equals() on null throws a NullPointerException. Use Objects.equals()
 * to safely handle null values.
 */