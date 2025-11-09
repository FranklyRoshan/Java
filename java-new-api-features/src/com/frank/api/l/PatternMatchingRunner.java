package com.frank.api.l;

public class PatternMatchingRunner {

	// Pattern Matching w/o vairable
	private static void instanceofOld(Object objStr) {
		if (objStr instanceof String) {
			String str = (String) objStr;
			System.out.println(str.toLowerCase());
		}
	}

	// Pattern matching with variable
	private static void instanceofNew(Object objStr) {
		if (objStr instanceof String str) {
			System.out.println(str.toLowerCase());
		}
	}

	record Transaction(String sender, String receiver, int amount) {
	}

	private static void printTransactionOld(Object objTransaction) {
		if (objTransaction instanceof Transaction transaction) {
			String sender = transaction.sender();
			String receiver = transaction.receiver();
			int amount = transaction.amount();

			System.out.println(sender + " " + receiver + " " + amount);
		}
	}

	private static void printTransactionNew(Object objTransaction) {
//			if (objTransaction instanceof Transaction (String sender, String receiver, int amount)) {
		if (objTransaction instanceof Transaction(var sender, var receiver, var amount)) {
			System.out.println(sender + " " + receiver + " " + amount);
		}
	}

	public static void main(String[] args) {
		Object objStr = "Some String";
		instanceofNew(objStr);
		instanceofOld(objStr);

		printTransactionOld(new Transaction("You", "Me", 1_000_000));
		printTransactionNew(new Transaction("You", "Me", 1_000_000));
	}

}

/*
 * Pattern Matching with Variable Declaration (Java 14)
 * 
 * Simplified instanceof Check
 * 
 * Eliminates explicit casting.
 * 
 * Declares variable inline.
 * 
 * Cleaner and safer.
 * 
 * 
 * Pattern Matching with Records (Java 21)
 * 
 * Supports automatic deconstruction of records.
 * 
 * • Automatically extracts fields (sender, receiver, amount).
 * 
 */