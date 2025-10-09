package JavaPackage;
import java.util.Scanner;

public class MaxNumber {

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
		
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("The maximum of is: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("The maximum of is: " + n2);
		} else {
			System.out.println("The maximum of is: " + n3);
		}
		
		scanner.close();
		scan.close();
		scann.close();

	}

}
