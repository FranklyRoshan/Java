package com.frank.OOPsDetails.DefaultConstructor;

class Fan {
	private String name;

	public void getName(String name) {
		this.name = name;
	}

	public String display(String name) {
		return name;
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		Fan fan = new Fan(); // Calls default constructor
		fan.display("Havells");
	}

}

//Default Constructor
/*
 * What? A default constructor is a constructor with no parameters. If a class
 * has no constructor, Java automatically provides a default constructor.
 * 
 * Why? It initializes an object with default values.
 * 
 */
