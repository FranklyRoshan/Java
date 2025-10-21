package com.example.java.model;

public enum OliveName {

	KALAMATA("Kalamata"), LINGURIAN("Lingurian"), GAETA("Gaeta"), LUGANO("Lugano");

	private String name;

	OliveName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
