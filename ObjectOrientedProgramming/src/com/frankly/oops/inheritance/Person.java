package com.frankly.oops.inheritance;

// Java always by default inherient the Class to "Object" Class like this
//public class Person extends Object {
// So That Class have basic methods like hashcode, toString, etc. 
public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		super();
		this.name = name;
		System.out.println("Person Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return name + "#" + email + "#" + phoneNumber;
	}
//	Method (Code Snippet) from the default JAVA Object Class
// 	This is called Method Overriding

}
