package basics;

public class ThrowVsThrows {

	public static void main(String[] args) {
		try {
			riskyMethod();
		} catch (Exception e) {
			System.out.println("Caught: " + e.getMessage());
		}
	}
	
	// Method that declares it might throw an exception
	public static void riskyMethod() throws Exception {
		// Actually throwing an exception
		throw new Exception("Something went wrong!");
	}

}
