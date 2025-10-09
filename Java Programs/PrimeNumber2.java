package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
	
		Scanner b = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a = b.nextInt();
		
		boolean flag = false;
		for (int i = 2; i <=  a/2; ++i) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println(a + " is a prime number.");
		} else {
			System.out.println(a + " isn't a prime number.");
		}
		
		b.close();
		
	}

}
