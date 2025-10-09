package programs;

import java.util.Scanner;

public class BalanaceDigitNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input the number
		System.out.println("Enter an odd-digit number: ");
		String number = scanner.nextLine();
		
		int len = number.length();
		
		// Check if length is odd
		if (len % 2 == 0) {
			System.out.println("Only odd-digit numbers are allowed.");
			return;
		}
		
		int mid = len / 2;
		int leftSum = 0;
		int rightSum = 0;
		
		// Sum digits on the left side of the middle digit
		for (int i = 0; i < mid; i++) {
			leftSum += number.charAt(i) - '0';
		}
		
		// Sum digits on the right side of the middle digit
		for (int i = mid + 1; i < len; i++) {
			rightSum += number.charAt(i) - '0';
		}
		
		// Compare the sums
		if (leftSum == rightSum) {
			System.out.println("Balanced Digit Number");
		} else {
			System.out.println("Not a Balanced Digit Number");
		}
		
		scanner.close();
	}

}
