package basics;

//Array of Objects

class Students {
	String name;
	int age;
	
	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println(name + " - " + age);
	}
}

public class ArrayOfObject {
	public static void main(String... args) {
		Students[] students = new  Students[3];
		
		students[0]  = new  Students("Alice", 20);
		students[1]  = new  Students("Bob", 21);
		students[2]  = new  Students("Charlie", 19);
		
		
		for (Students s : students) {
			s.display();
		}
		
		
	}
}