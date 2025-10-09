/*
 LeetCode-style Question #10:

Problem: Count Vowels in a String

Write a Java program that:

Takes a string input from the user.

Counts and prints the number of vowels (a, e, i, o, u) in the string.

Vowels can be both uppercase and lowercase.

Example:

Input:
Enter a string: Hello World

Output:
Number of vowels: 3

(H, e, ll, l, o,  W, o, rld)
 */
package programs;

import java.util.Scanner;

public class CountVowelsInAString {

	public static int counterVowels(String input) {
		input = input.toLowerCase();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String userInput = scanner.nextLine();

		int result = counterVowels(userInput);
		System.out.println("Number of vowels: " + result);

		scanner.close();
	}

}



/*
import java.util.*;

public class CountVowelsInAString {
	public static void main (String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int vowelCount = 0;

		for(int i = 0; i< input.length(); i++) {
			char ch = Character.toLowerCase(input.charAt(i));

			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;
			default:
			}
		}

		System.out.println("Number of vowels: " + vowelCount);

		scanner.close();
	}
}
*/

/*
import java.util.*;

public class CountVowelsInAString {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String input = scanner.nextLine();

		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		int vowelCount = 0;

		for(char ch : input.toLowerCase().toCharArray()) {
			if (vowels.contains(ch)) {
				vowelCount++;
			}
		}

		System.out.println("Number of vowels: " + vowelCount);

		scanner.close();
	}
}
*/

/*
 import java.util.Scanner;

public class CountVowelsInAString {
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




