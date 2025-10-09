package JavaPackage;

import java.util.Scanner;

public class VowelConsantCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		
		input = input.toLowerCase();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (ch  == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}
			
		}
		
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number if consonants: " + consonants);
		
		scanner.close();
	}

}
