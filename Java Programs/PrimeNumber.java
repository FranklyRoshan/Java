package JavaPackage;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime (int n) {
		
		if (n <= 1) {
			return false;
		} 
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
		
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		boolean  isPrime = isPrime(n);
		if (isPrime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " isn't a prime number.");
		}
		
		
		scanner.close();

	}

}
