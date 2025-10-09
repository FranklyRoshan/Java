package JavaPrograms;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = a.nextInt();
		
		System.out.println("Entered number is: " + num);
		
		a.close();

	}

}
