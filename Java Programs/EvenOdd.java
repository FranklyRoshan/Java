package JavaPackage;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.print("The number is even.");
		} else {
			System.out.print("The number is odd.");
		}
		
		scanner.close();

	}

}
