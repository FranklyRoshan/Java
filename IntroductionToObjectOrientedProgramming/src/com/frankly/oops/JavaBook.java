package com.frankly.oops;

public class JavaBook {

	private int noOfCopies;

	JavaBook(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

//	void setNoOfCopies(int noOfCopies) {
//		this.noOfCopies = noOfCopies;
//	}

//	Source (Alt+Shift+S) > Generate getters and setters...
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMuch) {
//		this.noOfCopies = this.noOfCopies + howMuch;
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
//		if (this.noOfCopies - howMuch > 0) {
//			this.noOfCopies = this.noOfCopies - howMuch;
//		}

		setNoOfCopies(this.noOfCopies - howMuch);
	}


	void book() {
		System.out.println("Art of Computer Programming");
		System.out.println("Effective Java");
		System.out.println("Clean Code");
	}

}
