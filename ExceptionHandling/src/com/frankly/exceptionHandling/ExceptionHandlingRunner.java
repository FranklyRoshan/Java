package com.frankly.exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		Method1();
		System.out.println("Main Method");
	}

	private static void Method1() {
		Method2();
		System.out.println("Method1 Ended");
	}

	private static void Method2() {
		try {
			
//		Exception
//		NullPointerException
//		String str = null;
//		str.length();

//		ArrayIndexOutOfBoundsException
			int[] i = { 1, 2 };
			int number = i[3];
			
			System.out.println("Method2 Ended");
		} catch(NullPointerException ex) {
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}

//		Multiple Exceptions can be extended in single catch with in b/w pipe (|) symbol	
//		catch (IOException | SQLException ex) {
//			ex.printStackTrace();
//		}
	}

}
