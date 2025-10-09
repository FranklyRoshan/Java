package JavaPackage;

public class InheritanceAndPolymorphism {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		animal1.makeSound();
		dog.makeSound();
		cat.makeSound();
	}
}
