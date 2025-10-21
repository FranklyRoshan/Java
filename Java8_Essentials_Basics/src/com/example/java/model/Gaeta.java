package com.example.java.model;

// Inheritance
public class Gaeta extends Olive {
	public Gaeta() {
		super(OliveName.GAETA, OliveColor.GREEN, 2);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Italy";
	}
}
