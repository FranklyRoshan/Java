/*
Question: "Find First Repeating Character"

Description:
Write a program that:

Takes a string input from the user using Scanner

Finds and prints the first character that appears more than once

If no character repeats, print "No repeating character"


Example 1:
Input: programming
Output: r

Example 2:
Input: abc
Output: No repeating character


---

This helps you practice:

Loops

Set usage

Efficient character tracking
 */
package programs;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		HashSet<Character> seen = new HashSet<>();
		char result = '\0'; // Null character placeholder
		boolean found = false;

		for (char ch : input.toCharArray()) {
			if (seen.contains(ch)) {
				result = ch;
				found = true;
				break;
			} else {
				seen.add(ch);
			}
		}

		if (found) {
			System.out.println("The First repeating character: " + result);
		} else {
			System.out.println("No repeating character");
		}

		scanner.close();
	}

}
