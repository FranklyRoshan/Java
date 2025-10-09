/*
 Question: "Bank Account Class" (Object-Oriented Design)

Description:
Design a class BankAccount that has the following features:

Fields: accountNumber, accountHolder, balance

Methods:

deposit(double amount)

withdraw(double amount)

displayDetails()



Write a Java program that:

Creates an object of BankAccount

Performs a deposit and withdrawal

Prints the final account details
 */
package programs;

import java.util.Scanner;

class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	// Constructor
	public BankAccount (String accNumber, String accHolder, double initBalance) {
		this.accountHolder = accNumber;
		this.accountNumber = accHolder;
		this.balance = initBalance;
	}


// Deposit method
public void  deposit (double amount) {
	if  (amount > 0) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	} else {
		System.out.println("Invalid deposit amount: ");
	}
}

//  Withdraw method
public void withdraw  (double amount) {
	if (amount > 0 && amount <= balance) {
		balance -= amount;
		System.out.println("Withdrawn: " + amount);
	} else {
		System.out.println("Insufficient balance or invalid amount.");
	}
}

// Display details
public void displayDetails() {
	System.out.println("\n--- Account Details ---");
	System.out.println("Account Number: " + accountNumber);
	System.out.println("Account Holder: " + accountHolder);
	System.out.println("Balance: " + balance);
	}
}


public class BankMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input account details
		System.out.print("Enter Account Number: ");
		String accNum = scanner.nextLine();

		System.out.print("Enter Account Holder Name: ");
		String accHolder = scanner.nextLine();

		System.out.print("Enter Initial  Balance: ");
		double initBalance = scanner.nextDouble();

		BankAccount account = new BankAccount (accNum, accHolder, initBalance);

		// Perform deposit and with draw
		System.out.print("Enter amount to deposit: ");
		account.deposit(scanner.nextDouble());

		System.out.print("Enter amount to withdraw: ");
		account.withdraw(scanner.nextDouble());

		// Display final details
		account.displayDetails();
		scanner.close();
	}

}
