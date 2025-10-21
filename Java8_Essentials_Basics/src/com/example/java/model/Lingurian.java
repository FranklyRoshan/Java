package com.example.java.model;

// Inheritance
public class Lingurian extends Olive {
	public Lingurian() {
		super(OliveName.LINGURIAN, OliveColor.PURPLE, 2);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Italy";
	}
}
