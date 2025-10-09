package JavaPackage;
import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			}
		} else {
			isLeapYear = false;
		}
		
		if (isLeapYear) {
			System.out.print(year + " is a leap year.");
		} else {
			System.out.print(year + " isn't a leap year");
		}
		
		scanner.close();

	}

}
