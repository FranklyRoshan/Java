package com.example.java.model;

// Inheritance
public class Lugano extends Olive {
	public Lugano() {
		super(OliveName.LUGANO, OliveColor.GREEN, 2);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Switzerland";
	}
}
