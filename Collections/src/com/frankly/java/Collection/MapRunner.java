package com.frankly.java.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		
		String string = "This is an awesome occasion " + "This has never happened before";

//		Characters count
		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = string.toCharArray();
		for (char character : characters) {
			Integer integer = occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}

		System.out.println(occurances);

//		String Count
		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] words = string.split(" ");

		for (String word : words) {
			Integer integer = stringOccurances.get(word);
			if (integer == null) {
				stringOccurances.put(word, 1);
			} else {
				stringOccurances.put(word, integer + 1);
			}
		}

		System.out.println(stringOccurances);
	}

}
