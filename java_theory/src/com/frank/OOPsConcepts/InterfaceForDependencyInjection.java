package com.frank.OOPsConcepts;

/*
 * What is Dependency Injection (DI)?
 * 
 * What? Passing dependencies from outside, not creating inside.
 * 
 * Why? Makes code flexible, testable, and less dependent.
 * 
 * When? Use when you want to swap implementations easily.
 */

/*
 * Implementing Dependency Injection
 * 
 * What? Allows flexibility by programming to an interface instead of a concrete class.
 * 
 * Example: Database interface for switching between MySQLDatabase and MongoDatabase.
 */
interface Database {
	void connect();
}

class MySQLDatabase implements Database {
	@Override
	public void connect() {
		System.out.println("Connected to MySQL.");
	}
}

class MongoDatabase implements Database {
	@Override
	public void connect() {
		System.out.println("Connected to MongoDB.");
	}
}

class Application {
	private Database db;

	public Application(Database db) {
		this.db = db;
	}

	public void start() {
		db.connect();
	}
}

public class InterfaceForDependencyInjection {
	public static void main(String[] args) {
		Database mySQL = new MySQLDatabase();
		Application app1 = new Application(mySQL);
		app1.start();

		Database mongo = new MongoDatabase();
		Application app2 = new Application(mongo);
		app2.start();
	}
}
