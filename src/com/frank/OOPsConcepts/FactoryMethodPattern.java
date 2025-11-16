package com.frank.OOPsConcepts;

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

class Shape {
}

class Circle extends Shape {
}

class Square extends Shape {
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Shape circle 
            = ShapeFactory
                .getShape("CIRCLE");
        
        Shape square 
            = ShapeFactory
                .getShape("SQUARE");
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
 * Example 3: Factory Method Pattern
 * 
 * What? Central place to create objects.
 * 
 * When? You want control over object creation!
 * 
 * How? Factory method decides what object to return.
 * 
 * Shape shape = ShapeFactory.getShape("CIRCLE"); // returns Circle
 * 
 * Key Benefit: Decouples object creation from usage.
 * 
 */
