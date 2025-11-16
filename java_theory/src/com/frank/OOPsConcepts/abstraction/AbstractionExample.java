package com.frank.OOPsConcepts.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        // We use the abstract type 'Shape' for polymorphism (Lesson 11!)
        Shape myCircle = new Circle(10.0);
        Shape myRectangle = new Rectangle(5.0, 8.0);
        
        // ABSTRACTION: We only call the abstract method (the "WHAT").
        // We don't worry about the specific calculation (the "HOW").
        
        System.out.println("--- Circle Results ---");
        myCircle.displayDescription();
        System.out.println("Area: " + myCircle.calculateArea()); 
        System.out.println("Perimeter: " + myCircle.calculatePerimeter());

        System.out.println("\n--- Rectangle Results ---");
        myRectangle.displayDescription();
        System.out.println("Area: " + myRectangle.calculateArea());
        System.out.println("Perimeter: " + myRectangle.calculatePerimeter());
    }
}

/*
 * Abstraction hides complexity Only show what is necessary
 * 
 * The user interacts with the essential parts While the implementation details
 * remain hidden
 * 
 * 📌 Real-Life Examples of Abstraction Driving a Car: You turn the steering
 * wheel and press the accelerator You don’t need to know how the engine, fuel
 * injection, or transmission work.
 * 
 * Printing a Document: You click "Print" on your computer. You don’t need to
 * know how the printer processes the data or converts it into ink on paper.
 * 
 */

/*
 * Abstraction simplifies usage by hiding low-level details.
 * 
 * Allows focus on essential functionality without worrying about
 * implementation.
 * 
 * Used in everyday life, software architecture, and programming languages.
 * 
 */