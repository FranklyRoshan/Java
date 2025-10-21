package com.example.java;

import java.text.NumberFormat;

public class ConvertingPrimitiveValuesToString {
	public static void main(String[] args) {

		int intValue = 12;
		String fromInt = Integer.toString(intValue);
		System.out.println(fromInt);

		boolean boolValue = true;
		String fromBool = Boolean.toString(boolValue);
		System.out.println(fromBool);

		long longValue = 10_000_000l;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatted = formatter.format(longValue);
		System.out.println(formatted);

		double doubleValue = 10_000d;
		NumberFormat formatter1 = NumberFormat.getNumberInstance();
		String formatted1 = formatter1.format(doubleValue);
		System.out.println(formatted1);

	}

}
