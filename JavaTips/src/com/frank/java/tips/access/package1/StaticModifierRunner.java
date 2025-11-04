package com.frank.java.tips.access.package1;

class Player {

	private String name;
//	private int count = 0;
	// Static Variable is a class level variable
	private static int count = 0;
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

//	public int getCount() {
//		return count;
//	}

	// Static method
	static public int getCount() {
		// System.out.println(name) // Static method only access the static variables
		return count;
	}

	// Instance method
	public String getName() {
		// Instance method can access both Static and Instance variable
		System.out.println(count);
		return name;
	}

}

class Time {

	// final Variable (constant)
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
//		System.out.println(player1.getClass());
		System.out.println(Player.getCount());

		Player player2 = new Player("Federer");
//		System.out.println(player2.getClass());
		System.out.println(Player.getCount());

		// Final variable
		System.out.println(0x80000000);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(60 * 60 * 24);
		System.out.println(Time.SECONDS_IN_DAY);
	}
}
