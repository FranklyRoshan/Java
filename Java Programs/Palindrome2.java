package JavaPrograms;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
	
		Scanner a = new Scanner (System.in);
		
		System.out.print("Enter the number greater than 10: ");
		int num = a.nextInt();
		
		int rev = getReverse(num, 0);
		
		if (rev == num) {
			System.out.println(num + " is a palindrome.");
		} else {
			System.out.println(num + " isn't a palindrome.");
		}
		
	a.close();
	}

	static int getReverse(int num, int rev) {
		if (num == 0) { 
			return rev;
			}

			int rem = num % 10;
			rev = rev*10 + rem;
			
		   return getReverse(num/10, rev);
		
		
	}
}
