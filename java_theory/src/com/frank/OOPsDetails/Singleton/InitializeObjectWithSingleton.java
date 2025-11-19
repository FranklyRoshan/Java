package com.frank.OOPsDetails.Singleton;

/*Using Singleton
 * What? Ensures only one instance of a class exists and provides a global access point to it.
 * Why?
 * Prevents multiple object creation, reducing memory usage.
 * Ensures controlled access to shared resources.
 * How?
 * Declare a private static instance inside the class.
 * Provide a public static method to return the instance.
 * Make the constructor private to restrict direct instantiation.
 * Example: Singleton for Database Connection
 * Ensures only one database connection exists – getInstance() always returns the same reference.
 * Prevents multiple connections – Avoids unnecessary resource usage.
 * Global Access – Any class can get a database connection using DatabaseConnection.getInstance().
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() {
        try {
            // Simulated database connection
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";
            connection = DriverManager.
                            getConnection(url, user, password);
            System.out.println("Database connected.");
        } catch (SQLException e) {
            throw new RuntimeException(
                "Error connecting to database!", e);
        }
    }

    // Public method to provide access to the single instance
    // TODO: Synchronize if you want to make this thread safe
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        // Getting the singleton instance
        DatabaseConnection db1 
                = DatabaseConnection.getInstance();
        
        DatabaseConnection db2 
                = DatabaseConnection.getInstance();

        // Verifying both references point to the same object
        System.out.println("db1 == db2: " + (db1 == db2));
    }
}


public class InitializeObjectWithSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
