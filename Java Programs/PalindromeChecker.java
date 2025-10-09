package JavaPackage;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		String str = "liril";
		
		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " isn't a palindrome.");
		}
		
	}
	
	public static boolean isPalindrome(String stri) {
		if (stri.length() <= 1) {
			return true;
		} 

	char firstChar = stri.charAt(0);
	char lastChar = stri.charAt(stri.length() - 1);
	
			if (firstChar !=  lastChar) {
				return false;
			}	
	
			String subString = stri.substring(1,stri.length()-1);
			return isPalindrome(subString);
	}
	
}
