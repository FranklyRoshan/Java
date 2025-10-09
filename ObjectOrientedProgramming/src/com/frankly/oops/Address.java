package com.frankly.oops;

public class Address {

//	State
	private String line1;
	private String city;
	private String zip;

//	Creation
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return line1 + ", " + city + ", " + zip;
	}

}
