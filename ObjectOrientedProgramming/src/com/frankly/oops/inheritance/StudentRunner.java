package com.frankly.oops.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

//		Student student = new Student();
//		student.setName("Frank");
//		student.setEmail("frank@gmail.com");
		
		/*
		Person person = new Person();
		person.setName("Frank");
		person.setEmail("frank@gmail.com");
		person.setPhoneNumber("123-456-7890");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		*/
		
		Employee employee = new Employee("Frank", "Programmer Analyst");
//		employee.setName("Frank");
		employee.setEmail("frank@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
//		employee.setTitle("Programmer Analyst");
		System.out.println(employee);
		
	}

}
