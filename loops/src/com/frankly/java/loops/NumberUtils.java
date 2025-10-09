package com.frankly.java.loops;

public class NumberUtils {

	public static void main(String[] args) {
		reverseNumber(1909);
	}

	/**
	 * This method reverses a given integer and returns the reversed number. If the
	 * number is negative, it returns -1 as the reverse of a negative number is
	 * undefined. If the number is zero, it returns 0 as the reverse of 0 is 0.
	 * 
	 * @param number: an integer
	 * @return reversed number, or -1 if number is negative, or 0 if number is zero.
	 */
	public static int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}

		if (number == 0) {
			return 0;
		}

		int rev = 0;
		while (number > 0) {
			int digit = number % 10;
			rev = rev * 10 + digit;
			number = number / 10;
			System.out.format("digit-%d number-%d reverseNumber-%d", digit, number, rev).println();
		}
		return rev;
	}
}