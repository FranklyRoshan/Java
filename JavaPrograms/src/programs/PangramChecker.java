/*
 Question: Check If a String Is a Pangram

Problem Statement:
A pangram is a sentence that contains every letter of the English alphabet at least once (a-z).

Write a function to check if a given string is a pangram.

Example 1:

Input:
"The quick brown fox jumps over the lazy dog"

Output:
true
(Contains every letter from a to z)


Example 2:

Input:
"Hello World"

Output:
false
 */

/*
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PangramChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();

		if(isPangram(sentence)) {
			System.out.println("The sentence is a program.");
		} else {
			System.out.println("The sentence is NOT a Pangram");
		}

		scanner.close();
	}

	public static boolean isPangram(String sentence) {

		sentence = sentence.toLowerCase();

		Set<Character> letters = new HashSet<>();

		for (char ch : sentence.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				letters.add(ch);
			}
		}

		return letters.size() == 26;
	}

}
*/

/*
import java.util.Scanner;

public class PangramChecker {
	public  static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase

		boolean[] letters = new boolean[26]; // To track each other

		for (char ch : sentence.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				letters[ch - 'a'] = true; // Mark that letter as found
			}
		}

		boolean isPangram = true;
		for (boolean b: letters) {
			if (!b) {
				isPangram = false;
				break;
			}
		}

		if(isPangram) {
			System.out.println("The string is a Pangram.");
		} else {
			System.out.println("The String isn't a Pangram");
		}

		scanner.close();
	}
}
*/
package programs;

import java.util.HashSet;
import java.util.Scanner;
public class PangramChecker {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine().toLowerCase();

		HashSet<Character> letters = new HashSet<>();

		for(char ch : sentence.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				letters.add(ch);
			}
		}

		if (letters.size() == 26) {
			System.out.println("The sentence is a pangram.");
		}	else {
			System.out.println("The sentence isn't a pangram.");
		}

		scanner.close();
	}
}
