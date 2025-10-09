package JavaPackage;
import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " isn't a palindrome");
		}
		
		scan.close();
		
	}

}
