package com.frank.OOPsConcepts;

interface Listener {
	void onClick();
}

class Button {
	private Listener listener;

	public void setListener(Listener listener) {
		this.listener = listener;
	}

	public void click() {
		if (listener != null) {
			listener.onClick();
		}
	}
}

public class InterfaceWithObserverPattern {
	public static void main(String[] args) {
		Button button = new Button();

		Listener listener = () -> System.out.println("Button clicked!");

		button.setListener(listener);

		button.click();
	}
}

/*
 * What are Design Patterns?
 * 
 * What? Reusable solutions for common coding problems.
 * 
 * Why? Makes code easier to understand, change, and reuse.
 * 
 * Where? Used in big projects, frameworks, and everyday coding.
 *
 * How? By applying proven patterns like Singleton, Strategy, Factory, and
 * Observer.
 * 
 */

/*
 * Example 4: Observer Pattern
 * 
 * What? One-to-many notification system.
 * 
 * When? Need listeners (e.g., UI buttons, events).
 * 
 * How? Register listeners, notify them when something happens.
 * 
 * Listener listener = () -> System.out.println("Button clicked!");
 * 
 * button.setListener(listener);
 * 
 * button.click();
 */

/*
 * Creating Callbacks (Observer Pattern) 
 * 
 * What? Enables event-driven programming
 * 
 * where one class notifies another. 
 * 
 * Example: Listener interface for handling
 * button clicks
 */