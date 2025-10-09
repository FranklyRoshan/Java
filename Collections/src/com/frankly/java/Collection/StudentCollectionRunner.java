package com.frankly.java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1,"Frank"), new Student(100, "Adam"),
				new Student(2, "Eve"));

		ArrayList<Student> studentsAll = new ArrayList<>(students);
		
		System.out.println(studentsAll);

		Collections.sort(studentsAll);
		
		System.out.println("Descending " + studentsAll);

//		Collections.sort(studentsAll, new DescendingStudentComparator());
		studentsAll.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator " + studentsAll);

 	}

}
