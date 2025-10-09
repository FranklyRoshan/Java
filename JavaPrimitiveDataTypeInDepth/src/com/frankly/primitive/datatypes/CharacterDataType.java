package com.frankly.primitive.datatypes;

public class CharacterDataType {

	private char ch;

	public CharacterDataType(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		// Alphabet and it's not vowel
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;

	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) { // b/w '0' and '9'
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
		return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabet() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabet() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
