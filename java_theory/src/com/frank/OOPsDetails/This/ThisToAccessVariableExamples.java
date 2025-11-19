package com.frank.OOPsDetails.This;

import java.util.Objects;

//Using this. is optional except when there is shadowing
class Animal {
	private String name;
	private int age;
	private String species;

	public Animal(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}

	// Equals

	@Override
	public int hashCode() {
		return Objects.hash(name, age, species);
	}
}

public class ThisToAccessVariableExamples {
	public static void main(String[] args) {

	}
}
