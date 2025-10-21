package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class WorkingWithDateAndTime {

	public static void main(String[] args) {

		// Create a Date object representing the current date and time
		Date d = new Date();
		System.out.println(d);

		// Create a GregorianCalendar object for a specific date
		// Months are ZERO-based: 0 = January, 1 = February, ..., 11 = December
		GregorianCalendar gc = new GregorianCalendar(2025, 1, 28); // 28 February 2025

		// Add 1 day to the calendar date
		gc.add(Calendar.DATE, 1); // 28 February 2025

		// Convert the GregorianCalendar object to a Date object
		Date d2 = gc.getTime();
		System.out.println(d2);

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d2));

		LocalDateTime idt = LocalDateTime.now();
		System.out.println(idt);

		LocalDate id = LocalDate.of(2025, 1, 28);
		System.out.println(id);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
		System.out.println(dtf.format(id));

	}

}
