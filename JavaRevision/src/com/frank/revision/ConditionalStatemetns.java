package com.frank.revision;

public class ConditionalStatemetns {

	public static void main(String[] args) {

		// 1. If Statement
		int age = 20;
		if (age > 18) {
			System.out.println("Eligible to vote");
		}

		// 2. if–else Statement
		int num = 5;
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		// 3. Nested if
		int a = 10;
		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("Positive Even");
			}
		}

		// if–else if–else Ladder
		int marks = 85;
		if (marks >= 90) {
			System.out.println("A Grade");
		} else if (marks >= 75) {
			System.out.println("B Grade");
		} else {
			System.out.println("C Grade");
		}

		// 5. switch / match Statement
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Invalid Day");
		}

		// 6. Ternary Operator (Shortcut)
		int b = 10;
		String result = (b % 2 == 0) ? "Even" : "Odd";

		// ⚙️ 1. Java 14+ Enhanced switch Expressions
		String days = "MON";
		String type = switch (days) {
		case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
		case "SAT", "SUN" -> "Weekend";
		default -> throw new IllegalArgumentException("Invalid day: " + days);
		};
		System.out.println(type);

		int number = 3;
		String results = switch (number) {
		case 1 -> "One";
		case 2 -> "Two";
		case 3 -> {
			String s = "Three";
			yield s + " (yielded)";
		}
		default -> "Unknown";
		};
		System.out.println(results);
		

	}
}
