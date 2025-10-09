package com.frankly.exceptionHandling;

import java.util.Scanner;

// Try with resources 
public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			int number = numbers[5];
		}
	}

}
