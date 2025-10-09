package com.frankly.oops;

public class JavaBookRunner {
	public static void main(String[] args) {
		JavaBook artOfComputerProgramming = new JavaBook(5120000);
		JavaBook effectiveJava = new JavaBook(2520000);
		JavaBook cleanCode = new JavaBook(1620000);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.book();
		effectiveJava.book();
		cleanCode.book();

//		artOfComputerProgramming.noOfCopies = 5120000;
//		effectiveJava.noOfCopies = 2520000;
//		cleanCode.noOfCopies = 1620000;

//		artOfComputerProgramming.setNoOfCopies(5120000);
//		effectiveJava.setNoOfCopies(2520000);
//		cleanCode.setNoOfCopies(1620000);
		
		artOfComputerProgramming.increaseNoOfCopies(10000);
		artOfComputerProgramming.decreaseNoOfCopies(5000);
		
//		Escape Sequence \n, \t, \r, \b, \\, \', \"
		System.out.println("\nArt of Computer Programming No. of Copies " + artOfComputerProgramming.getNoOfCopies());

	}
}
