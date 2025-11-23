package com.frank.CoreJava;

//📌 Records Are Immutable & When NOT to Use Records (Mutable State)
public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}
