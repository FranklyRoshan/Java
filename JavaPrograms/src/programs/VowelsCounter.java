/*
programsCodewars-style Question #5:

Problem: Count Vowels in a String

Write a function that takes a string and returns the number of vowels (a, e, i, o, u) in it.
Ignore case (both uppercase and lowercase letters should be counted).


Example:

Input: "Hello World"
Output: 3
// (e, o, o)
*/

/*
import java.util.Scanner;

public class VowelCounter {
	public static int counterVowels(String input) {
		input = input.toLowerCase(); // Make it case-insensitive
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		// Get input form user
		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();

		// Count vowels and print the result
		int result = counterVowels(userInput);
		System.out.println("Number of vowels: " + result);

		scanner.close();
	}
}
*/


/*
import java.util.Scanner;

public class VowelCounter {
	public static int counterVowels(String input) {
		int count = 0;
		for (char ch : input.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(ch) != -1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String userInput = scanner.nextLine();

		System.out.println("Number of vowels: " + counterVowels(userInput));

		scanner.close();
	}
}
*/
package programs;

import java.util.Scanner;

public class VowelsCounter {
	public static long countVowels(String input) {
		return input.toLowerCase()
					.chars()
					.filter(c -> "aeiou".indexOf(c) != -1)
					.count();
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String userInput = scanner.nextLine();

		System.out.println("Number of vowels: " + countVowels(userInput));

		scanner.close();
	}
}
