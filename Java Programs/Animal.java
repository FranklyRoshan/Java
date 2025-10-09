package JavaPackage;

public class Animal {

	public void makeSound () {
		System.out.println("The animal makes a sound.");
 		}
	
	}
	
	class Dog extends Animal {
		public void makeSound() {
			System.out.println("The dog barks.");
		}
	}
	
	class Cat extends Animal {
		public void makeSound() {
			System.out.println("The cat meows.");
		}
	}
	
