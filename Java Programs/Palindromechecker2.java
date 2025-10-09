package JavaPackage;

import java.util.Scanner;

public class Palindromechecker2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");		
		String word = scanner.next();
		
		if (isPalindrome(word)) {
			System.out.println(word + " is a palindrome.");
		} else {
			System.out.println(word+ " isn't a palindrome.");
		}
		
		scanner.close();
	}
	
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			} 
			
			left++;
			right--;
		}
		
		return true;
	}
}
