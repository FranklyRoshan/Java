package com.frankly.oops;

public class StaticVariblesAndFunctions {
	public static void main(String[] args) {
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");

		s1.display();
		s2.display();

		// Change static variable
		Student.schoolName = "Sunrise School";

		s1.display(); // school name will change for both
		s2.display();
	}
}
