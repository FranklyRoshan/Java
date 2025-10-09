/*
 Question: Count the Frequency of Each Character in a String

Problem Statement:
Write a Java program to count the frequency of each character in a given string (excluding spaces).


---

Example Input:

Input: hello world

Example Output:

h: 1
e: 1
l: 3
o: 2
w: 1
r: 1
d: 1
 */
package programs;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		HashMap<Character, Integer> freqMap = new HashMap<>();

		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
			}

		}

		for (char ch : freqMap.keySet()) {
			System.out.println(ch + ": " + freqMap.get(ch));
		}

		scanner.close();
	}

}
