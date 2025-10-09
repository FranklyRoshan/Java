/*
Question: "Count Vowels and Consonants in a String"

Description:
Write a Java program that takes a string input from the user and 
counts the number of vowels and consonants in it. 
Ignore digits, spaces, and special characters. 
The check should be case-insensitive.
 */

package programs;

import java.util.Scanner;

public class VowelConsonantCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String input = scanner.nextLine().toLowerCase(); // Make it case-insensitive
		
		int vowels = 0, consonants = 0;
		
		for(char ch : input.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') { // Only consider letters
				if("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		
		System.out.println("vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		
		scanner.close();
	}

}
