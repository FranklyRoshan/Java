package JavaPackage;
import java.util.Scanner;

public class Factorialcalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of \"n\": ");
		int n = scan.nextInt();
		int Fact = calculateFactorial(n);
		System.out.println("The factorial of " + n + " is: " + Fact);
		
		scan.close();

	}
	
	public static int calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculateFactorial(n -1);
		}
	}

}
