/*
 Question: "Student Grades Analyzer"

Description:
Create a Java program that:

Defines a Student class with:

name (String)

marks (int array of 5 subjects)

Method to calculate and return the average marks.


In the main() method:

Use Scanner to input data for 3 students.

Display each student's name and average marks.




---

This challenge helps you:

Practice arrays inside objects

Use loops effectively

Improve data modeling for real-world use
 */

/*
import java.util.Scanner;

class Student {
	String name;
	int [] marks = new int[5];

	// Method to calculate average
	public double calculateAverage() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return (double) sum /marks.length;
	}
}

public class StudentAnalyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] students = new Student[3];

		// Input for 3 students
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();

			System.out.print("Enter name of the student " + (i + 1) +": " );
			students[i].name = scanner.nextLine();

			System.out.println("Enter marks for 5 subjects: ");
			for (int j = 0; j < 5; j++) {
				System.out.print("Subject: " + (j + 1) + ": ");
				students[i].marks[j] = scanner.nextInt();
			}

			scanner.nextLine();
		}

			System.out.println("\n--- Student Averages ---");
			for (Student s : students) {
				System.out.println(s.name + " - Average Marks: " + s.calculateAverage());
		}

		scanner.close();
	}

}
*/
package programs;

import java.util.Scanner;

class Student {
	String name;
	int[] marks;

	Student(int subjects) {
		marks = new int[subjects];
	}

	// Method to calculate average
	public double calculateAverage() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return (double) sum/marks.length;

	}
}

public class StudentAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask how many students
		System.out.print("Enter number of students: ");
		int numStudents = scanner.nextInt();

		// Ask how many subjects
		System.out.print("Enter number of subjects per student: ");
		int numSubjects = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		Student[] students = new Student[numStudents];

		// Input data for each student
		for (int i = 0; i < numStudents; i++) {
			students[i] = new Student(numSubjects);

			System.out.print("\nEnter name of the student " + (i + 1) + ": ");
			students[i].name = scanner.nextLine();

			System.out.println("Enter marks for " + numSubjects + "Subjects: ");
			for (int j = 0; j < numSubjects; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				students[i].marks[j] = scanner.nextInt();
			}
			scanner.nextLine(); //Consume newline
		}

		// Display results
		System.out.println("\n--- Student Averages ---");
		for (Student s : students) {
			System.out.println(s.name + " - Average  Marks: " + s.calculateAverage());
		}
		scanner.close();
	}
}