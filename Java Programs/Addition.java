package JavaPackage;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = s.nextInt();
		
		Scanner t = new Scanner(System.in);
		System.out.print("Enter the second number: ");
		int b = t.nextInt();
		
		int c = a + b;
		
		System.out.println("Addition of two number is: "+c);
		s.close();
		t.close();
	}

}
