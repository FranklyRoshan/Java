package com.frank.OOPsConcepts;

class Logger {
    private static Logger instance;

    private Logger() {
        // private constructor to 
        //prevent external instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println(logger1 == logger2); // true
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
 * Example 1: Singleton Pattern
 * 
 * What? One object shared across the app.
 * 
 * When? Need only one instance (e.g., Logger, Config).
 * 
 * How? Private constructor + static instance + lazy creation.
 * 
 * Logger logger1 = Logger.getInstance();
 * 
 * Logger logger2 = Logger.getInstance();
 * 
 * System.out.println(logger1 == logger2); // true Key
 * 
 * Benefit: Saves memory, consistent behavior.
 * 
 */
