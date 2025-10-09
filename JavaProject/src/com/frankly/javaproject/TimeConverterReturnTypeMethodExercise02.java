package com.frankly.javaproject;

// Return Type method Exercise 02
public class TimeConverterReturnTypeMethodExercise02 {
	public static int convertHoursToMinutes(int hours) {
		if (hours < 0) {
			return -1;
		}
		return hours * 60;
	}

	public static int convertDaysToMinutes(int days) {
		if (days < 0) {
			return -1;
		}
		return days * 24 * 60;
	}
}
