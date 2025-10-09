package JavaPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = a.nextLine();
		
		System.out.println("My name is " + name);
		a.close();
		
	}

}
