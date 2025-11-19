package com.frank.OOPsDetails.InnerClass;

/*
 * What?
 * An inner class is a class defined inside another class.
 * 
 * Why?
 * Improves encapsulation (restricts access).
 * Helps group related logic together.
 * Can access private members of the outer class.
 * 
 * 
 * Member Inner Class
 * What?
 * A non-static class inside another class.
 * Can access all members (including private) of the outer class.
 * Use when an inner class needs access to instance members of the outer class.
 * When you need to encapsulate logic that is tightly coupled with the outer class, like handling employee salary calculations inside an Employee class.
 * 
 * Example: Member Inner Class
 */

class Employee {
    private String name;
    private double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Member Inner Class
    class SalaryCalculator {
        double calculateBonus(double percentage) {
            return baseSalary * percentage / 100;
        }

        void displaySalaryDetails() {
            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Bonus: $" + calculateBonus(10));
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 5000);
        
        // Creating Inner Class Object
        Employee.SalaryCalculator calculator = emp.new SalaryCalculator();
        calculator.displaySalaryDetails();
    }
}

/*
 * 📌 When to Use What?
 * 
 * Member Inner Class → Use when an employee’s salary calculation logic is
 * tightly coupled with the Employee class (needs full access to outer class
 * members).
 * 
 * Static Nested Class → Use when a Database.Connection class manages
 * connections independently of the Database instance (does not need instance
 * variables of the outer class).
 * 
 * Local Inner Class → Use when an Order class needs an Invoice generator inside
 * its processOrder() method (used only within a specific method).
 * 
 * Anonymous Inner Class → Use when handling a button click event in a GUI
 * application (needed only once, for immediate use).
 * 
 */