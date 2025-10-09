package com.frankly.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday" };
		
		String dayWithMostCharacters = "";
		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}

		System.out.println("Day with the most number of characters: " + dayWithMostCharacters + "\n");

//		for (int i = 0; i < daysOfWeek.length; i++) {
//			System.out.println(daysOfWeek[i]);
//		}

		for (String element : daysOfWeek) {
			System.out.println(element);
		}

		System.out.println();

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
