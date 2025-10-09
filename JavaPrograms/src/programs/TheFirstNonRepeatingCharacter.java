/*
Question: "Find the First Non-Repeating Character in a String"

Description: Write a Java program that takes a string as input and finds the first character that does not repeat. Ignore case when determining repetition, 
but preserve the original case when printing the result.

Example:

Input: Swiss
Output: w
 */

package programs;

import java.util.*;

// HashMap-based version (Efficient for large strings)
public class TheFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String input = scanner.nextLine();
		scanner.close();
		
		String lowerInput = input.toLowerCase();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (char ch : lowerInput.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (int i = 0; i < input.length(); i++) {
			if (map.get(lowerInput.charAt(i)) == 1) {
				System.out.println("First non-repeating character: " +  input.charAt(i));
				return;
			}
		}
		
		System.out.println("No non-repeating character found.");
	}

}

/*
// Brute-force version (Less efficient, but simple)
public class TheFirstNonRepeatingCharacter {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String input = scanner.nextLine();
		scanner.close();
		
		String lowerInput = input.toLowerCase();
		boolean found =  false;
		
		for (int i = 0; i < lowerInput.length(); i++) {
			char ch = lowerInput.charAt(i);
			int count = 0;
			
			for (int j = 0; j < lowerInput.length(); j++) {
				if (ch == lowerInput.charAt(j)) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println("First non-repeating character: " + input.charAt(i));
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("No non-repeating character found.");
		}
	}
}
*/
