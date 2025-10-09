/*
Question: Reverse a String Word by Word

Problem Statement:
Given a string s, reverse the order of words in the string.
A word is defined as a sequence of non-space characters.

The words in s will be separated by at least one space.

Return a string where the words appear in reverse order, with only a single space separating them.

Remove any extra spaces at the beginning or end of the string.


Example 1:

Input:
s = "the sky is blue"

Output:
"blue is sky the"
*/
package programs;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scanner.nextLine();

		s = s.trim();
		String[] words = s.split("\\s+");

		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			if(i != 0) {
				reversed.append(" ");
			}
		}

		System.out.println("Reversed string: " + reversed.toString());
		scanner.close();
	}

}
