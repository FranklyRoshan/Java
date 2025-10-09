/*
 Question: Write a Java program that checks if two strings are anagrams of each other.
(An anagram is when two strings have the same characters in a different order, like "listen" and "silent").
 */

package programs;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first String: ");
		String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("The Strings are not anagram ( String length mismatch).");
		} else {
			HashMap<Character, Integer> charCount = new HashMap<>();

			// Count characters from first string
			for (char ch : str1.toCharArray()) {
				charCount.put(ch, charCount.getOrDefault(ch,0) + 1);
			}

			for (char ch : str2.toCharArray()) {
				if (!charCount.containsKey(ch)) {
					System.out.println("The Strings aren't anagrams.");
					scanner.close();
					return;
				}

				charCount.put(ch, charCount.get(ch) - 1);

				if (charCount.get(ch) < 0) {
					System.out.println("The Strings aren't anagrams.");
					scanner.close();
					return;
				}
			}

			System.out.println("The string are anagrams.");
		}

		scanner.close();
	}
}


/*
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input two strings
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

		// Check length first
		if (str1.length() != str2.length()) {
			System.out.println("Not an Anagram (different string length).");
		} else {
			// convert to char arrays and sort
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// compare sorted arrays
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("The strings are anagrams.");
			} else {
				System.out.println("The strings aren't anagrams.");
			}
		}

		scanner.close();
	}

}
*/
