package com.frankly.oops.interfaceClass;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move Forward");
	}

	@Override
	public void down() {
		System.out.println("Move Backward");
	}

	@Override
	public void left() {
		System.out.println("Move Left");
	}

	@Override
	public void right() {
		System.out.println("Move Right");
	}
	
}
