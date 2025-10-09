package com.frankly.java.Collection;

public class ReverseWordsInSentence {

	public String reverseWordsInSentence(String sentence) {

		if ((sentence == null) || sentence.equals("")) {
			return "INVALID";
		}

		StringBuilder reversedSentence = new StringBuilder();

		for (String word : sentence.split(" ")) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversedSentence.append(reversedWord).append(" ");
		}

		return reversedSentence.toString().trim();

	}

}
