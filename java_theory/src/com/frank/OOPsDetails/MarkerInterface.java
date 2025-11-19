package com.frank.OOPsDetails;

/*
 * What?
 * A marker interface is an interface with no methods or fields.
 * Why?
 * Tells the Java compiler or runtime that a class has a special property.
 * Used by Java libraries to enable specific behavior.
 * Example: Serializable tells Java that an object can be serialized.
 * 
 * Examples in Java:
 * Marker Interface - Purpose
 * Serializable - Enables object serialization
 * Cloneable - Allows object cloning
 * Remote - Supports remote method invocation
 * 
 * Example (Creating Marker Interface)
 * SecureResource is an empty interface used to mark classes needing extra security.
 * BankAccount implements SecureResource, while PublicDocument does not require extra security.
 * verifyAccess() uses instanceof to determine if an object needs additional verification.
 */

// Marker Interface (Empty)
interface SecureResource {
}

// Class implementing the marker interface
class BankAccount implements SecureResource {
	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void display() {
		System.out.println("Bank Account: " + accountNumber + ", Balance: $" + balance);
	}
}

// Class without marker interface
class PublicDocument {
	private String title;

	public PublicDocument(String title) {
		this.title = title;
	}

	public void display() {
		System.out.println("Public Document: " + title);
	}
}

// Utility to check security access
class SecurityCheck {
	public static void verifyAccess(Object obj) {
		if (obj instanceof SecureResource) {
			System.out.println("Additional security check needed.");
		} else {
			System.out.println("Access granted.");
		}
	}
}

public class MarkerInterface {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", 5000.00);

		PublicDocument doc = new PublicDocument("Public Guidelines");

		account.display();
		doc.display();

		SecurityCheck.verifyAccess(account);
		SecurityCheck.verifyAccess(doc);
	}
}

