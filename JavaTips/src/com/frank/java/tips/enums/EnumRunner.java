package com.frank.java.tips.enums;

import java.util.Arrays;

// Enumerations
// Enums usally stored in a separate file.
/*
 * enum Season {
 * //	WINTER, SPRING, SUMMER, FALL;
 * //	// 0, 1, 2, 3
 * 
 * 	WINTER(1), SPRING(2), SUMMER(3), FALL(4);
 * 
 * private int value;
 * 
 * private Season(int value) {
 * 		this.value = value;
 * 	}
 *
 *	public int getValue() {
 *		return value;
 *	}
 *
 * }
 * 
 */

public class EnumRunner {

	public static void main(String[] args) {
//		String season = "Fall";
		Season season = Season.FALL;

		Season season1 = Season.valueOf("WINTER");

		System.out.println(season);
		System.out.println(season1);
		System.out.println(Season.SPRING.ordinal());

		System.out.println(Arrays.toString(Season.values()));

		System.out.println(Season.SPRING.ordinal());
		System.out.println(Season.SPRING.getValue());
	}

}
