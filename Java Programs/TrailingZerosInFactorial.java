package JavaPackage;

import java.util.Scanner;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int trailingZeros = countTrailingZerosInFactorial(number);
		System.out.println("Number of trailing Zeros in " + number + "! is: " + trailingZeros);
		
		scanner.close();
	}

	public static int countTrailingZerosInFactorial(int num) {
		int count = 0;
		int divisor = 5;
		while (num / divisor > 0) {
			count += num / divisor;
			divisor *= 5;
		}
		
		return count;
	}
}
