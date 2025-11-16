package com.frank.OOPsConcepts.polymorphism;

//📌 Example: Run-Time Polymorphism (Method Overriding)
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow Meow");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}

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