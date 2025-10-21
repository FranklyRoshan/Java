package com.example.java;

public class TryAndMultiCatchBlock {

	public static void main(String[] args) {

		String str = "Welcome!";
		char[] chars = str.toCharArray();

		// Try/Catch Block (Alt + Shift + Z)
		try {
			// Error: Array Index Problem!
			char lastChar = chars[chars.length]; // char lastChar = chars[chars.length - 1];
			System.out.println(lastChar);

			// Error: String Index problem!
			String sub = str.substring(10); // String sub = str.substring(0);

			// Error: Cannot divide a number by zero!
			int a = 10;
			int b = 0; // int b = 2

			// This line will cause an ArithmeticException (divide by zero)
			int result = a / b;
			System.out.println("Result: " + result);

		} catch (ArrayIndexOutOfBoundsException e) { // catch (Exception e)
//			e.printStackTrace();
			System.out.println("Error: Array Index Problem!");
		} catch (StringIndexOutOfBoundsException e) { // catch (Exception e)
//			e.printStackTrace();
			System.out.println("Error: String Index problem!");
		} catch (ArithmeticException e) { // catch (Exception e)
			// Handles division by zero error
//			e.printStackTrace();
			System.out.println("Error: Cannot divide a number by zero!");
		}
	}

}
