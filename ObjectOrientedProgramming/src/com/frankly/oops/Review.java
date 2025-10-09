package com.frankly.oops;

public class Review {
	
//	State
	private int id;
	private String description;
	private int rating;

//	Creating
	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}


	@Override
	public String toString() {
		return String.format("%d; %s; %d", id, description, rating);
	}

}
