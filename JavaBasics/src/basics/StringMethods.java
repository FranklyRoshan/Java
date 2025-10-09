/*
 Java Strings

Definition:
In Java, a String is an object that represents a sequence of characters. 
It is immutable, meaning once created, it cannot be changed.

Common String Methods:

Method Description

length() Returns length of string
charAt(index) Returns character at index
substring(start) Returns substring from index
substring(start, end) Substring between start and end
equals(str) Compares string values
equalsIgnoreCase() Compares ignoring case
toUpperCase() Converts to upper case
toLowerCase() Converts to lower case
contains(str) Checks if substring exists
replace(a, b) Replaces characters
trim() Removes leading/trailing spaces

 */

package basics;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Frank";
		
		System.out.println("Length: " + name.length());
		System.out.println("char at 2: " + name.charAt(2));
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Contains 'ra': " + name.contains("ra"));
		System.out.println("SubsString: " + name.substring(1,4));
		System.out.println("Replace: " + name.replace('a','0'));
	}

}
