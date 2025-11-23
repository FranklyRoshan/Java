package com.frank.CoreJava;

public class TheBestPracticesWithConditions {

	public static void main(String[] args) {

		// What Are the Best Practices with Conditionals? #

		// --- 1. Use else if Instead of Multiple if Statements ---
		int age = 12;
		System.out.println("--- Age Check (12) ---");
		if (age < 18) {
			System.out.println("Minor");
		} else if (age < 60) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}

		// --- 2. Avoid Complex Conditions (Define missing variables) ---

		// Define and initialize missing boolean variables to make the code runnable
		boolean hasLicense = true;
		boolean hasPermit = false;
		boolean hasViolations = false;

		// Hard to Read (Complex Condition in if)
		System.out.println("\n--- Driving Check (Complex) ---");
		if ((age > 18 && hasLicense) || (age > 16 && hasPermit && !hasViolations)) {
			System.out.println("Allowed to drive");
		} else {
			System.out.println("Not allowed to drive");
		}

		// Improved Readability (Using Meaningful Variables)
		boolean isAdultWithLicense = age > 18 && hasLicense;
		boolean isTeenWithPermit = age > 16 && hasPermit && !hasViolations;

		System.out.println("--- Driving Check (Improved) ---");
		if (isAdultWithLicense || isTeenWithPermit) {
			System.out.println("Allowed to drive");
		} else {
			System.out.println("Not allowed to drive");
		}

		// --- 3. Prefer Ternary Operator for Simple Cases (Define missing variables)
		// ---

		// Define missing variable
		int x = 15;

		// Fix: Declare result once.
		String result;

		// ❌ Verbose (Original logic commented out for clarity, though it's now valid)
		// if (x > 10) result = "High"; else result = "Low";

		// ✅ Use ternary (Reassign the 'result' variable)
		result = (x > 10) ? "High" : "Low";
		System.out.println("\n--- Ternary Operator (x=15) ---");
		System.out.println("Result: " + result); // Output: High

		// --- 4. Use switch Instead of Multiple if-else When Applicable (Define missing
		// variables) ---

		// Define missing variable
		String day = "Tuesday";

		// Fix: Use a new variable name or reuse the previous one
		String dayType = switch (day) {
		// Java 14+ switch expression syntax is used
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Workday";

		default -> "Weekend";
		};

		System.out.println("\n--- Switch Expression (day=Tuesday) ---");
		System.out.println(dayType); // Output: Workday

	}

}