/*
Constructors in Java

Definition:
A constructor is a special method used to initialize objects. 
It is called automatically when an object is created.

Key Features:

Same name as the class
No return type (not even void)
Can be default, parameterized, or copy constructor


Types of Constructors:

1. Default Constructor – No parameters
2. Parameterized Constructor – Accepts arguments
3. Copy Constructor – Copies values from another object (user-defined in Java)

*/

package basics;

class Books {
	String title;
	String author;
	
	// Default constructor
	Books() {
		this.title = "Unknown Title";
		this.author = "Unknown Author";
	}
	
	// Parameterized Constructor
	Books(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Copy Constructor
	Books(Books original) {
		this.title = original.title;
		this.author = original.author;
	}
	
	// Method to display details
	void display() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// Using Default Constructor
		Books book1 = new Books();
		book1.display();
		
		// Using Parameterized Constructor
		Books book2 = new Books("Ikigai", "Frankcesc Miralles");
		book2.display();
		
		// Using copy Constructor
		Books book3 = new Books(book2);
		book3.display();
	}

}
