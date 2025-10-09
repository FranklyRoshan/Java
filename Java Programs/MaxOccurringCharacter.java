package JavaPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine();
		char maxChar = findMaxOccurringCharacter(input);
		 
		 System.out.println("The maximum occurring character is: " + maxChar);
		 scanner.close();
	}

	public static char findMaxOccurringCharacter(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		} 
		
		char maxChar ='\0';
		int maxCount = 0;
		
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		return maxChar;
	}
}
