/*
 Question: Count Occurrences of a Character in a String

Problem:
Write a Java program that takes a string and a character as input, and counts how many times that character appears in the string.

Example:
Input:

Enter a string: hello world
Enter the character to count: l

Output:

The character 'l' appears 3 times.
 */
package programs;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence  = scanner.nextLine();

		// Trim leading/trailing spaces and split by one or more spaces
		String[] words = sentence.trim().split("\\s+");

		System.out.println("Number of words: " + words.length);

		scanner.close();
	}

}
