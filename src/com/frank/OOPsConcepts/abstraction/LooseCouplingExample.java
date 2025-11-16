package com.frank.OOPsConcepts.abstraction;
//

//📌Complex Example of Tight Coupling
//public class ShoppingCartEntry {
//	public double price;
//	public int quantity;
//}
//
//public class Order {
//	private ShoppingCartEntry[] items;
//	private double salesTax;
//
//	public double calculateTotalPrice() {
//		double totalPrice = 0;
//		for (ShoppingCartEntry item : items) {
//			totalPrice += item.price * item.quantity;
//		}
//		return totalPrice + salesTax;
//	}}

/*Direct Dependency:
	Order directly
	accesses ShoppingCartEntry
	fields.
Tightly Coupled:
	Changes in
	ShoppingCartEntry might
	affect Order.
*/

// 📌Solution: Reducing Coupling
//	public class ShoppingCartEntry {
//		private double price;
//		private int quantity;
//
//		public double getTotalPrice() {
//			return price * quantity;
//		}
//	}
//
//	public class ShoppingCart {
//		private List<ShoppingCartEntry> items;
//
//		public double getTotalPrice() {
//			double totalPrice = 0;
//			for (ShoppingCartEntry item : items) {
//				totalPrice += item.getTotalPrice();
//			}
//			return totalPrice;
//		}
//	}
//
//	public class Order {
//		private ShoppingCart cart;
//		private double salesTax;
//
//		public double calculateTotalPrice() {
//			return cart.getTotalPrice() + salesTax;
//		}
//	}

	/*
	 * Encapsulation: ShoppingCartEntry handles its own pricing logic. Improved
	 * Maintainability: Order no longer depends on ShoppingCartEntry.
	 * 
	 */
public class LooseCouplingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
