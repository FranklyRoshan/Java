package JavaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		System.out.print("Enter a number [two digit number or more]: ");
		int num = a.nextInt();
		
		int reverse = 0, rem, temp;
		
		temp = num;
		
		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		
		if (num == reverse) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " isn't a palindrome");
		}
		
		a.close();

	}

}
