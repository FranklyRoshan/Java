package JavaPrograms;

import java.util.Scanner;

public class Palindrome3 {

	public static void main(String[] args) {
		String str, rev="";
		Scanner a = new Scanner (System.in);
		System.out.print("Enter a string: ");
		str = a.nextLine();
		
		int length  = str.length();
		
		for (int i = length - 1; i >= 0; i-- ) {
			rev = rev  + str.charAt(i);
		}
			if(str.equals(rev)) {
				System.out.println(str + " is a palindorme");
			} else {
				System.out.println(str + " isn't a palindrome");
			}
		
		a.close();
	}

}
