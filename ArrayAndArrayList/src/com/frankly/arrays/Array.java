package com.frankly.arrays;

public class Array {

	private String[] arrays;

//	Variable Argument (...)
	public Array(String... arrays) {
		this.arrays = arrays;
	}

	public String day() {
		for (String array : arrays) {
			return array;
		}
		return null;
	}

}
