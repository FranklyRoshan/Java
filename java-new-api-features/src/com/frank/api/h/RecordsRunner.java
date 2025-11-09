package com.frank.api.h;

public class RecordsRunner {
	
	record Person(String name, String email, String phoneNumber) {
		Person(String name, String email, String phoneNumber) {
			if (name == null) {
				throw new IllegalArgumentException("name is null");
			}
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
	}

//	Compact constructor
//	(Compact constructor only used in records)
//	record Person(String name, String email, String phoneNumber) {
//		Person {
//			if(name == null)
//				throw new  IllegalArgumentException("name is null");
//	}

	public static void main(String[] args) {
		Person person = new Person("Frank", "frank@gamil.com", "9876543210");
		System.out.println(person);
		System.out.println(person.name);

		Person person1 = new Person("Frank", "frank@gamil.com", "9876543210");
		Person person2 = new Person("Frank", "frank@gamil.com", "9876543210");
		System.out.println(person1.equals(person1));
		System.out.println(person.equals(person2));
		System.out.println(person1.equals(person2));

//		Records
//		1. Eliminate verbosity in creating Java Beans
//			* Public accessor method, constructor, equals, hashcode and toString 
//			  automatically created.
//			* You can create custom implementation if you want.
//		2. Compact constructors are only allowed in rocords.
//		3. You can add static fields, state intializers, and static methods
//				But, You cann't add instance variables or instance intializers
//				Howerve you can add instance method
	}

}
