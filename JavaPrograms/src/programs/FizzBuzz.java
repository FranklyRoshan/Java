/*
Exercism-style Question #6:

Problem: FizzBuzz

Write a program that prints numbers from 1 to n.
But for multiples of 3, print "Fizz" instead of the number.
For multiples of 5, print "Buzz".
For numbers which are multiples of both 3 and 5, print "FizzBuzz".

Example:

If n = 15, output should be:

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
*/


/*
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number(n): ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

		scanner.close();
	}

}
*/
package programs;

import java.util.Scanner;

public class FizzBuzz {
	public  static String getFizzBuzz (int num) {
		if (num % 15 == 0) {
			return "FizzBuzz";
		}
		if (num % 3 == 0) {
			return "Fizz";
		}
		if (num % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(num);
	}

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (n): ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(getFizzBuzz(i));
		}

		scanner.close();
	}
}