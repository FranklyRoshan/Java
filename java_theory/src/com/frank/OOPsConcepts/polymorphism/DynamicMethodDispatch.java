package com.frank.OOPsConcepts.polymorphism;




// What is Dynamic Method Dispatch? #

/* 
 * What?: Mechanism by which a call to an overridden method is resolved at runtime instead of compile time.
 * 
 * How?: Uses method overriding and a parent class reference that points to a child class object.
 * 
 * Example: Dynamic Method Dispatch in Action
 */

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        // Parent reference, Child object
        Parent obj = new Child(); 

        obj.show(); // Output: Child class method
    }
}
/*
 * The method execution is determined at runtime, based on the actual object
 * (Child), not the reference type (Parent).
 * 
 * This enables loose coupling, where the parent reference can point to any
 * subclass object.
 */

/*
 * Key Takeaways
 * 
 * Polymorphism enables flexibility by allowing the same method call to perform
 * different actions.
 * 
 * Dynamic Method Dispatch is the mechanism for achieving runtime polymorphism
 * in Java.
 * 
 * Static Binding happens at compile time, while Dynamic Binding happens at
 * runtime.
 * 
 */