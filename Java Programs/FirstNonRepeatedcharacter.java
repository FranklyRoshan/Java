package JavaPackage;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedcharacter {

	public static void main(String[] args) {
		String input = "hello";
		char result = findFirstNonRepeatedcharacter(input);
		
		System.out.println("The first non-repeated character is: " + result);
	}
	public static char findFirstNonRepeatedcharacter(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		for (char ch : str.toCharArray()) {
			if (charCountMap.get(ch) == 1) {
				return ch;
			}
		}
		
		return '\0';
	}
}
