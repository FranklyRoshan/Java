package com.frankly.conditionalIfAndSwitchStatement;

public class IfStatementRunner {

	public static void main(String[] args) {
		int i = 20;
		
		// Once any one condition satisfies the statement will cutoff won't even check
		// the rest of them
		// if-else-if Statement
		if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 24) {
			System.out.println("i = 24");
			
		} else if (i == 23) {
			System.out.println("i = 23");
			
		} else {
			System.out.println("i != 25 and i != 24");
		}

		puzzle1();
		puzzle2();
		puzzle3();
		puzzle4();
		puzzle5();
	}



	private static void puzzle1() {
		int k = 15;

		if (k > 20) {
			System.out.println(1);
		} else if (k < 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

	private static void puzzle2() {
		int l = 15;

		// Independent Statement
		// if Statement
		if (l < 20) {
			System.out.println("l<20");
		}

		// if-else Statement
		if (l > 20) {
			System.out.println("l>20");
		} else {
			System.out.println("Who am I?");
		}
	}

	private static void puzzle3() {
		int m = 15;

		// Nested if Statement
		if (m > 20) {
			if (m < 20) {
				System.out.println("m > 20");
			} else {
				System.out.println("Who am I?");
			}
		}
	}

	private static void puzzle4() {
		int i = 0;
//		if(i) {
//			System.out.println(i);
//		}

//		if(i=1) {
//			System.out.println(i);
//		}

		// Condition is important in Conditional Statement
		if (i == 1) {
			System.out.println(i);
		}
	}

	private static void puzzle5() {
		int number = 5;
		if (number < 0) {
			number = number + 10;
		}
			number++;
			System.out.println(number);
	}

}
