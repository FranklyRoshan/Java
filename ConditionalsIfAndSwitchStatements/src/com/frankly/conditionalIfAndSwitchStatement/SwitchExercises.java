package com.frankly.conditionalIfAndSwitchStatement;

public class SwitchExercises {
	public static void main(String[] args) {
//	public static void main(String... args) { // Ellipsis
//		System.out.println(determineNameOfDay(0));
//		System.out.println(determineNameOfMonth(1));
//		System.out.println(isWeekDay(1));
		isVowel('A');
	}

	public static String determineNameOfDay(int dayNumber) {

		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Invalid day";
		}

//		String result = "";
//		switch (dayNumber) {
//		case 0:
//			result = "Sunday";
//			break;
//		case 1:
//			result = "Monday";
//			break;
//		case 2:
//			result = "Tuesday";
//			break;
//		case 3:
//			result = "Wednesday";
//			break;
//		case 4:
//			result = "Thursday";
//			break;
//		case 5:
//			result = "Friday";
//			break;
//		case 6:
//			result = "Saturday";
//			break;
//		default:
//			result = "Invalid Value";
//			break;
//
//		}
//
//		return result;
	}

	private static String determineNameOfMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid Month";
		}
	}

//	Fall through Code
	private static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 6:
			return false;

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;

		}
		return false;
	}

	public static boolean isVowel(char ch) {

		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
		case 'A', 'E', 'I', 'O', 'U':
			return true;
		default:
			return false;
		}

        // Use a switch statement to check for each vowel, both lowercase and uppercase
//		Fall through code
//        switch (ch) {
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                return true;
//            default:
//                return false;
//        }

	}
}
