package JavaPackage;
import java.util.Scanner;

public class DigitSumCalculator {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		int sum = 0;
		
		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		
		System.out.println("The sum of digits is: " + sum);
		
		scan.close();
		
	}

}
