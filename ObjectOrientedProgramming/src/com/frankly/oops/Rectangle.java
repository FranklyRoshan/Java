package com.frankly.oops;

public class Rectangle {

//	State
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

//	Operations
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int perimeter() {
		return 2 * (length * breadth);
	}

	public int area() {
		return length * breadth;
	}

	@Override
	public String toString() {
		return String.format("Length - %d, Breadth - %d, Area - %d, Perimeter - %d", length, breadth, perimeter(),
				area());
	}

}
