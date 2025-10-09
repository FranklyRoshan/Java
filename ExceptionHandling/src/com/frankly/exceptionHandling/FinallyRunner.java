package com.frankly.exceptionHandling;

import java.util.Scanner;

// finally - code within the "finally" always run, even in exception

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 4, 5 };

			int number = numbers[5];

		} catch (Exception e) {
//			System.exit(1); (Caution: Don't ever run this code with this snippet, It'll crash the Application)
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			scanner.close();
		}

		System.out.println("Just before closing out main");
	}

}
