package JavaPackage;
import java.util.Scanner;

public class MaxNumberFinder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = scanner.nextInt();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Second number: ");
		int n2 = scan.nextInt();
		
		Scanner scann = new Scanner(System.in);
		System.out.print("Enter the third number: ");
		int n3 = scann.nextInt();
		
		
		int max = n1;
		
		if (n2 > max) {
			max = n2;
		}
		
		if (n3 > max) {
			max = n3;
		}
		
		System.out.println("The maximum number is: " + max);
		
		scanner.close();
		scan.close();
		scann.close();

	}

}
