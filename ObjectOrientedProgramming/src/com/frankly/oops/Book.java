package com.frankly.oops;

import java.util.ArrayList;

public class Book {
	
//	State
	private int id;
	private String name;
	private String author;
	
//	Object Composition
	private ArrayList<Review> reviews = new ArrayList<>();
	
//	Creation
	public Book (int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
//	Operations
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	@Override
	public String toString() {
		return String.format("Book ID: %d; Book: %s; Author: %s; \nReviews: %s", id, name, author, reviews);
	}


}
