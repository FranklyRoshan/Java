package com.example.java.utilies;

public class CalculatorMathHelper {

	public static double addValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 + d2;
	}

	public static double subValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 - d2;
	}

	public static double productValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 * d2;
	}

	public static double divideValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 / d2;
	}

	public static double remainderValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 % d2;
	}

}
