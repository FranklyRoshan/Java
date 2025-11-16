package com.frank.real_life_coding_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	
	public static int romanToInt(String s) {
		Map<Character, Integer> values = new HashMap<>();
		values.put('I', 1);
		values.put('V', 5);
		values.put('X', 10);
		values.put('L', 50);
		values.put('C', 100);
		values.put('D', 500);
		values.put('M', 1000);
		
		int total = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int value = values.get(s.charAt(i));
			if(i + 1 < s.length() && value <values.get(s.charAt(i + 1))) {
				total -= value; 
			} else {
				total += value;
			}
		}
		
		return total;

	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Roman number: ");
		String s = scanner.nextLine();
		
		System.out.println(romanToInt(s));
		
	}

}
