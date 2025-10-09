package com.frankly.primitive.datatypes;

public class CharacterDataTypeRunner {

	public static void main(String[] args) {
		CharacterDataType characterDataType = new CharacterDataType('B');
		System.out.println(characterDataType.isVowel());
		System.out.println(characterDataType.isConsonant());
		System.out.println(characterDataType.isDigit());
		System.out.println(characterDataType.isAlphabet());
		CharacterDataType.printLowerCaseAlphabet();
		CharacterDataType.printUpperCaseAlphabet();

	}

}
