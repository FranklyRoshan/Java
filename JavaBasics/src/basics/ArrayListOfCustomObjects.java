package basics;

import java.util.ArrayList;

class Book {
	String title;
	
	Book (String title) {
		this.title = title;
	}
}

public class ArrayListOfCustomObjects {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Java Basics"));
		books.add(new Book("Advanced Java"));
		
		for (Book b : books) {
			System.out.println(b.title);
		}
	}

}
