package JavaPackage;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = scan.nextInt();
		
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.print("Fibonacci Series " + firstTerm + " " + secondTerm);

		for ( int i = 3; i <= n; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(" " + nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		
		scan.close();

	}

}
