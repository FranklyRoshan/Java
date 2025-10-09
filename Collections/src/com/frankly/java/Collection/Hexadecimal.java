package com.frankly.java.Collection;

public class Hexadecimal {
	public String str;

	public Hexadecimal(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
	}

	public boolean isHexdecimal() {
		if (str == null || str.equals("")) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
				return false;
			}
		}

		return true;
	}
}
