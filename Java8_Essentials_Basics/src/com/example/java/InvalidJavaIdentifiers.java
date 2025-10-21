package com.example.java;

/*  Java Identifiers (Variable Names)

    All Java variables must be identified with unique names.
    These unique names are called identifiers.
    Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
    Note: It is recommended to use descriptive names in order to create understandable and maintainable code: */

// Good
// int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
// int m = 60;

/*  The general rules for naming variables are:

    Names can contain letters, digits, underscores, and dollar signs
    Names must begin with a letter
    Names should start with a lowercase letter, and cannot contain whitespace
    Names can also begin with $ and _
    Names are case-sensitive ("myVar" and "myvar" are different variables)
    Reserved words (like Java keywords, such as int or boolean) cannot be used as names
    Invalid Identifiers
    Here are some examples of invalid identifiers that would cause errors: */

// Invalid identifiers:
/*
int 2ndNumber = 5;  // Cannot start with a digit
int my var = 10;    // Cannot contain spaces
int int = 20;       // Cannot use reserved keywords
*/

/*  An "invalid variable" in Java refers to a variable declaration or usage that violates the
    language's syntax rules for identifiers. This typically results in a compile-time error.
    Here are the common reasons for an invalid variable in Java:
    Starts with a Digit: Variable names cannot begin with a number. */

    // Invalid: Starts with a digit
	// int 1stPlace = 10;

    /* Contains Invalid Special Characters: Variable names can only contain letters, digits, underscores (_),
        and dollar signs ($). Other special characters are not allowed. */

    // Invalid: Contains a hyphen
	// String user-name = "John";

    // Invalid: Contains a space
	// String first Name = "Jane";
    /* Is a Reserved Keyword: Java has reserved keywords (e.g., int, class, public, if, for, continue)
        that cannot be used as variable names. */

    // Invalid: "class" is a reserved keyword
	// String class = "A";

    // Invalid: "continue" is a reserved keyword
	// boolean continue = false;

    /* Scope Issues: A variable might be considered "invalid" if it is accessed outside of its defined scope.
        This means trying to use a variable in a part of the code where it is not accessible. */

    public class InvalidJavaIdentifiers {
        public static void main(String[] args) {
            if (true) {
                int x = 10;
            }
            // Invalid: x is out of scope here
            // System.out.println(x);
        }
    }

    /* To declare a valid variable, ensure it adheres to these rules, typically starting with a letter,
        underscore, or dollar sign, and avoiding reserved keywords and invalid special characters. */