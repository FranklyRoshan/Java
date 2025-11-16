package com.frank.OOPsConcepts.abstraction;
/*
 * Overview
 * What?: Coupling measures how much a class depends on another class.
 * 
 * Tight Coupling: A class is tightly linked to another. Changes in one impacts other.
 * 
 * Loose Coupling: A class has minimal dependencies. Changes are easy to make.
 * 
 * 📌 Simple Example of Tight Coupling
 * Problem: OrderProcessor is tightly coupled to PayPalPayment. If we need another payment method, we must modify OrderProcessor.
*/

//class PayPalPayment {

//    void processPayment(int amount) {
//        System.out.println(
//            "Processing PayPal payment of $" + amount);
//    }
//}
//
//class OrderProcessor {
//    private PayPalPayment payment = new PayPalPayment();
//
//    void checkout(int amount) {
//        payment.processPayment(amount);
//    }
//}

/*Improved - Loose Coupling
 * Solution: Use an interface (PaymentMethod) to allow multiple implementations.
 */

interface PaymentMethod {
	void processPayment(int amount);
}

class PayPalPayment implements PaymentMethod {
	@Override
	public void processPayment(int amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}
}

class CreditCardPayment implements PaymentMethod {
	@Override
	public void processPayment(int amount) {
		System.out.println("Processing Credit Card payment of $" + amount);
	}
}

class OrderProcessor {
	private PaymentMethod payment;

	OrderProcessor(PaymentMethod payment) {
		this.payment = payment;
	}

	void checkout(int amount) {
		payment.processPayment(amount);
	}
}

public class CoulplingExample {
	public static void main(String[] args) {
		OrderProcessor order1 = new OrderProcessor(new PayPalPayment());
		order1.checkout(100);

		OrderProcessor order2 = new OrderProcessor(new CreditCardPayment());
		order2.checkout(200);
	}
}