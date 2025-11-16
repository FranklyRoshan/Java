package com.frank.OOPsConcepts;

class BankAccount {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(500);
		account.withdraw(100);
		System.out.println("Balance: " + account.getBalance());
	}
}

/*
 * ✅ Improved Code: Encapsulation
 * 
 * Use private fields
 * 
 * Add getters and setters as needed
 * 
 * Add methods to perform other operations with necessary validations
 * 
 */
