package JavaPrograms;

//import java.io.*;
//import java.util.Scanner;

public class reverseAStringInJavaImplementation {

	public static void main(String[] args) {
		
		String str = "Franly", nstr=" ";
		char ch;
		
		System.out.println("Original word: ");
		System.out.println("Frankly");
		
		for (int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		System.out.println("Reversed word: " + nstr);

	}

}
