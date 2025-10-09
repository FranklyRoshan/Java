/*
LeetCode-style Question #2:

Problem:
Write a function that takes a string and returns true if the string is a palindrome, and false otherwise.

A palindrome is a word that reads the same backward as forward.

Example:

Input: "madam"
Output: true

Input: "hello"
Output: false
*/
package programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String input = scanner.nextLine();

		// Clean the string: remove spaces and convert to lowercase
		String cleaned = input.replaceAll("\\s+","").toLowerCase();

		boolean isPalindrome= true;
		int n = cleaned.length();

		for(int i = 0; i < n/2; i++) {
			if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if(isPalindrome) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
		}

		scanner.close();
	}
}

/*
import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		// Convert to lowercase to handle case-insensitive comparison
		str = str.toLowerCase();

		// Reverse the string
		String reversed = new StringBuilder(str).reverse().toString();

		// Compare original and reversed strings
		return str.equals(reversed);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter a string: ");
		String input = scanner.nextLine(); // Read the whole line (handles spaces too)

		// Check if It's a palindrome
		boolean result = isPalindrome(input);
		System.out.println("Is '" + input + "' a palindrome? " + result);

		scanner.close(); // Always close the scanner
	}
}
*/

/*
public class Palindrome {
	public static boolean isPalindrome(String str) {
		// Reverse the string using StringBuilder
		String reversed = new StringBuilder(str).reverse().toString();

		// Check if original string equals the reversed string
		return str.equals(reversed);
	}
	public static void main(String... args) {
		String input = "madam";
		System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
	}
}
*/

/*
public class Palindrome {

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		// compare character from both ends moving toward the center
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false; // Not a palindrome
			}
			left++;
			right--;
		}

		return true; // It's a palindrome
	}

	public static void main(String... args) {
		String input = "madam";
		System.out.println("Is '" + input + "' a palindrome? " + isPalindrome(input));
	}
}
*/


/*
import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		// Remove space and convert to Lowercase
		String cleaned = input.replaceAll("\\s+", "").toLowerCase();

		// Reverse the String
		String reversed = new StringBuilder(cleaned).reverse().toString();

		// check if palindrome

		if (cleaned.equals(reversed)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string isn't a palindrome.");
		}

		scanner.close();
	}
}
*/