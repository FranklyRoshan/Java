package com.frankly.exceptionHandling;


// Puzzle1

class Connection {
	public void open() {
		System.out.println("Connection Opened");
	}

	public void close() {
		System.out.println("Connection Closed");
	}
}

public class Puzzle {
	
	private static void method2() {
		Connection connection = new Connection();
		connection.open();
		try {
//			LOGIC
			String str = null;
			str.toString(); // This will throw an exception
		} catch (Exception e) {
			System.out.println("An exception occurred: " + e);
		} finally {
			connection.close();
		}
	}
	public static void main(String[] args) {
		method2(); // Call the method
	}	
}


