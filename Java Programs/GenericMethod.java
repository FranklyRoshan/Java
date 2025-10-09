package JavaPackage;

public class GenericMethod {
	
	public static <T> void printArray(T[] array) {
		for (T itemT : array) {
			System.out.print(itemT + "");
	}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,5};
		String[] names = {"Jon", "Alice", "Jaime"};
		
		System.out.print("Numbers: ");
		printArray(numbers);
		
		System.out.print("Names: ");
		printArray(names);

	}

}
