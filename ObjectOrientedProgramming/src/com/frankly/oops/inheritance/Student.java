package com.frankly.oops.inheritance;

// Inheritance 
// IS A Relation - Student IS A Person
public class Student extends Person {

	private String collegeName;
	private int year;

	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
		System.out.println("Student Constuctor");

	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


}

