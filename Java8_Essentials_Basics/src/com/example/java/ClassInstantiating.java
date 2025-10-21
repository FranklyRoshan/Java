package com.example.java;

public class ClassInstantiating {
    public String type; // Instance Variable
    public static void main(String[] args) {
        ClassInstantiating item = new ClassInstantiating(); // Instantiation
        item.type = "Frank";
        item.displayItem();
    }

    private void displayItem() { // Instance method
        System.out.println("This is a " + this.type);
    }
}
