package com.frankly.oops;

public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(123, "Java", "James Gosling");
		book.addReview(new Review(100, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);
	}

}
