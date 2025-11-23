package com.frank.CoreJava;


//1. Define the Record class (Must be outside the main class)
//This implements the concise version of the Person data structure.
public record Person(String name, String email, String phoneNumber) {
}

/*
 * Records eliminate boilerplate code in Java Beans by automatically generating:
 * 
 * Constructor, Getters (accessors), toString(), equals(), and hashCode()
 * 
 * Makes code more readable and maintainable.
 */