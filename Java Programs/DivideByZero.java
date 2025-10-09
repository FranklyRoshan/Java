package JavaPackage;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Enter the denominator: ");
		int denominator = scanner.nextInt();
		scanner.close();
		
		try {
			int result = numerator / denominator;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero isn't allowed");
		}
		
	}

}
