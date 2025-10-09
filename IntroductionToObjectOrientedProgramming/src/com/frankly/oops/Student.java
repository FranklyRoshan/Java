package com.frankly.oops;


public class Student {
	static String schoolName = "Greenwood High"; // static variable
	String name;

	Student(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(name + " studies at " + schoolName);
	}
}