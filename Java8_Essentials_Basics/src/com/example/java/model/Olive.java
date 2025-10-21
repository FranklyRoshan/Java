package com.example.java.model;

// Encapsulation
public abstract class Olive {

//	public static final String KALAMATA = "Kalamata";
//	public static final String LINGURIAN = "Lingurian";

	private OliveName name = OliveName.KALAMATA;
	private OliveColor color = OliveColor.PURPLE;
	private int oil;

	public Olive() {
	} // No Argument Default Constructor

	public Olive(OliveName name, OliveColor color, int oil) {
		this.name = name;
		this.color = color;
		this.oil = oil;
	}

	public OliveName getName() {
		return name;
	}

	public void setName(OliveName name) {
		this.name = name;
	}

	public OliveColor getColor() {
		return color;
	}

	public void OliveColor(OliveColor color) {
		this.color = color;
	}

//	public int getOil() {
//		return oil;
//	}

	public int crush() {
		String msg = name + ", from " + getOrigin() + ": " + oil + " units";
		System.out.println(msg);
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	public abstract String getOrigin();

	@Override
	public String toString() {
		return name.toString();
	}
}
