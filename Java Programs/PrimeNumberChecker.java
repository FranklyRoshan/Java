package JavaPackage;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		
		boolean isPrime = CheckPrime(n);
		
		if (isPrime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " isn't a prime number.");
		}
		
		scanner.close();

	}
	
	public static boolean CheckPrime(int a) {
		if (a <= 1) {
			
			return false;
		} 
		
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
			
		return true;
		}
	}
