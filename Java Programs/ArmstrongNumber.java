package JavaPackage;
import java.util.*;

public class ArmstrongNumber {


	public static void main(String[] args) {
		
		int n, nu, num = 0, rem;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		n = scan.nextInt();
		
		nu = n;
		
		System.out.println();
		
		while (nu != 0) {
			
			rem = nu % 10;
			num += Math.pow(rem,3);
			nu = nu / 10;
			
		}

		if (num == n) {
			
			System.out.println("It\'s an Armstrong number.");
			
		}
		
		else {
			
			System.out.println("It\'s NOT an Armstrong number.");
			
			
		}
		
		scan.close();
		
	}

}
