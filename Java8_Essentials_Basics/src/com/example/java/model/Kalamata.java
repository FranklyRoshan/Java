package com.example.java.model;

// Inheritance
public class Kalamata extends Olive {

	public Kalamata() {
		super(OliveName.KALAMATA, OliveColor.BLACK, 3);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "Greece";
	}
}
