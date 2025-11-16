package com.frank.coding_problems;

public class UnaryOperatorRunner {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;

//		System.out.println(x++);
//		System.out.println(x);
//
//		System.out.println(++x);
//		System.out.println(x);

//		int z = x + y;
//		int z = ++x + y;
//		int z = ++x + ++y;
//		int z = x + ++y;

//		int z = x++ + y;
//		int z = x + y++;
		int z = x++ + y++;

		System.out.println(z);

	}

}
