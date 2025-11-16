package com.frank.OOPsConcepts;


interface PaymentStrategy {
	void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid $" + amount + " using Credit Card.");
	}
}

class PayPalPayment implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println("Paid $" + amount + " using PayPal.");
	}
}

class ShoppingCart {
	private PaymentStrategy paymentStrategy;

	public ShoppingCart(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout(int amount) {
		paymentStrategy.pay(amount);
	}
}

public class InterfaceWithStrategyPattern {
	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment());
		cart1.checkout(100);

		ShoppingCart cart2 = new ShoppingCart(new PayPalPayment());
		cart2.checkout(200);
	}
}

/*
 * Defining Strategy Pattern for Flexible Algorithms
 * 
 * What? Allows switching between different behaviors at runtime.
 * 
 * Example: Different payment methods implementing PaymentStrategy.
 * 
 */