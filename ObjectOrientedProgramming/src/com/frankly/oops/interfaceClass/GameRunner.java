package com.frankly.oops.interfaceClass;

// Interface is a contract

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		ChessGame game = new ChessGame();

//		Polymorphism
//		GamingConsole game = new MarioGame();
//		GamingConsole game = new ChessGame();
//		game.up();
//		game.down();
//		game.left();
//		game.right();

		// Polmorphism
		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
	}
}

}
