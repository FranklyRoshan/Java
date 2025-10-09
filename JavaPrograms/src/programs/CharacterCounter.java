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

public class CharacterCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String input = scanner.nextLine();

		System.out.print("Enter the character to count: ");
		char target = scanner.next().charAt(0);

		int count = 0;
		input = input.toLowerCase();
		target = Character.toLowerCase(target);

		for (char ch : input.toCharArray()) {
			if(ch == target) {
				count++;
			}
		}

		System.out.println("The character '" + target + "' appears " + count + " times (Case Insensitive.)");

		scanner.close();
	}

}
