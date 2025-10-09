package basics;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
			@SuppressWarnings("unused")
			int result = 10 / 0; // ArithmeticException (won't  be reacher)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error: Undefined/Indeterminate \"Division by zero\"");
		} catch (Exception e) {
			System.out.println("General exception caught.");
		}
	}

}
