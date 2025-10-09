package JavaPackage;
import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = scan.nextInt();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an another number: ");
		int num2 = scanner.nextInt();
		
		
		int num3 = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + num3);
		
		scan.close();
		scanner.close();
	}

}
