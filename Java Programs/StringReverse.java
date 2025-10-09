package JavaPackage;
import java.util.Scanner;
import java.lang.StringBuilder;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scan.nextLine();
		
		String reversed = reverseString(str);
		System.out.println("Reversed string: " + reversed);
		
		scan.close();

	}
	
	public static String reverseString(String string) {
		
		StringBuilder reversed = new StringBuilder();
		
		for (int i = string.length() - 1 ; i >= 0; i--) {
			reversed.append(string.charAt(i));
		}
		
		return reversed.toString();
	}

}
