package com.frank.api.f;

import java.time.DayOfWeek;

public class SwitchEnumsRunner {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;
		
		// Switch with Enums - Ensures all Enum values are handled
		String str = switch(dayOfWeek) {
		case SUNDAY -> "The First Day of the week!";
		case MONDAY -> "The First Business day of the week.";
		case TUESDAY, WEDNESDAY, THURSDAY -> "The Middle day Of the week.";
		case FRIDAY -> "The Last Business day of the week.";
		case SATURDAY -> "The Last day of the week.";
//		default -> "Invalid Day";
		};
		
		System.out.println(str);

	}

}

/*
 * Switch with Enums (Java 17)
 * 
 * Eliminates repetitive if-else logic, Ensures all Enum values are handled!
 */