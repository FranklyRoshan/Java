package JavaPackage;
import java.util.Scanner;

public class FactorialCalcuator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		long fact = 1;
		
		for(int i = 2; i <= n; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println("Factorial of "+ n +" is " + fact);
		
		scan.close();

	}

}
