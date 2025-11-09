package com.frank.api.f;

public class SwitchRecordRunner {

//	interface CustomerMessage {
//	}
//	// record
//	record Message(String text) implements CustomerMessage {
//	}
//
//	record Feedback(int rating, String description) implements CustomerMessage {
//	}

	// sealed
	sealed interface CustomerMessage permits Message, Feedback {
	}

	final record Message(String text) implements CustomerMessage {
	}

	final record Feedback(int rating, String description) implements CustomerMessage {
	}

	// Nested Record
	record SupportRequest(String user, CustomerMessage message) {
	}

	public static void main(String[] args) {
//		CustomerMessage customerMessage = new Message("Hello!");
		CustomerMessage customerMessage = new Feedback(5, "Really Good!");
		
//		String response = switch (customerMessage) {
//		case Message message -> message.text();
//		case Feedback feedback -> feedback.description();
//		default -> "Default value"; // Remove the default code line, You have to seal the interface
//		};

		String response = switch (customerMessage) {
		case Message(String text) -> text;
		case Feedback(int rating, String description) -> description;
		};

		System.out.println(response);
		
		SupportRequest request = new SupportRequest("Rahul", new Feedback(5, "Hello!"));

//		String responseMessage = switch(request) {
//		case SupportRequest(String user, CustomerMessage message) -> "user";
//		case SupportRequest(String user, Feedback feedback) -> "feedback";
//		};

		String responseMessage = switch (request) {
		case SupportRequest(String user, Message(String text)) -> text;
		case SupportRequest(String user, Feedback(int rating, String description)) -> description;
		};

		System.out.println(responseMessage);
	}

}

/*
 * Switch with Record Patterns (Java 21)
 * 
 * Allows direct record deconstruction, More concise and readable code.
 */