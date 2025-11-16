package com.frank.OOPsConcepts.abstraction;

// 📌2:Use Factory Pattern Instead of Hardcoding Dependencies 
/* Bad Example(Tight Coupling-Hardcoded Object Creation)
 * Application is tightly coupled to MySQLDatabase.
 * Cannot easily switch to PostgreSQL or other databases.
 */

//class MySQLDatabase {
//	void connect() {
//		System.out.println("Connected to MySQL.");
//	}
//}
//
//class Application {
//	private MySQLDatabase database = new MySQLDatabase(); // Hardcoded dependency
//
//	void start() {
//		database.connect();
//		System.out.println("Application started.");
//	}
//
//}

/*
 * Good Example (Loose Coupling - Using Factory Pattern)
 * 
 * Application now depends on Database, not a specific implementation.
 * 
 * Can easily switch databases without modifying Application class.
 */

// Factory Pattern manages object creation.

interface Database {
		void connect();
	}

	class MySQLDatabase implements Database {
		@Override
		public void connect() {
			System.out.println("Connected to MySQL.");
		}
	}

	class PostgreSQLDatabase implements Database {
		@Override
		public void connect() {
			System.out.println("Connected to PostgreSQL.");
		}
	}

// Factory to create Database instances
	class DatabaseFactory {
		public static Database getDatabase(String type) {
			if (type.equalsIgnoreCase("MySQL")) {
				return new MySQLDatabase();
			} else if (type.equalsIgnoreCase("PostgreSQL")) {
				return new PostgreSQLDatabase();
			}
			throw new IllegalArgumentException("Unknown database type");
		}
	}

	class Application {
		private Database database;

		// Constructor Injection
		public Application(Database database) {
			this.database = database;
		}

		void start() {
			database.connect();
			System.out.println("Application started.");
		}
	}

public class ReduceCouplingWithFactoryPattern {
    public static void main(String[] args) {
        Database db = DatabaseFactory.getDatabase("MySQL");
        Application app = new Application(db);
        app.start();
    }
}

