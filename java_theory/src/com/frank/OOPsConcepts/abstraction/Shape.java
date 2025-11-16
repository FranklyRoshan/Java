package com.frank.OOPsConcepts.abstraction;
public abstract class Shape { 
    
    // Abstract methods: Defines WHAT the shape MUST do (the contract).
    // Subclasses MUST provide an implementation for these.
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Concrete method: A common feature shared by all shapes.
    public void displayDescription() {
        System.out.println("This is a two-dimensional geometric shape.");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    // Concrete implementation (The HOW for a Circle's area).
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Concrete implementation (The HOW for a Circle's perimeter).
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Concrete implementation (The HOW for a Rectangle's area).
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Concrete implementation (The HOW for a Rectangle's perimeter).
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

