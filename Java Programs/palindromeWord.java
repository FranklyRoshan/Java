package JavaPackage;
import java.util.Scanner;

public class palindromeWord {

	public static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s+", "").toLowerCase();
		
		 int left = 0;
		 int right = str.length() - 1;
		 
		 while (left < right) {
			 if (str.charAt(left) != str.charAt(right)) {
				 return false;
			 }
			 left++;
			 right--;
		 }
		 return true;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		
	   boolean isPal = isPalindrome(input);
	   
	   if (isPal) {
		   System.out.println("The String is a palindrome.");
	   }
	   
	   else {
		   System.out.println("The string is not a palindrome.");
	   }
		

	}

}
