package JavaPackage;

public class Average {

	public static void main(String[] args) {
		
		double[] value = {5.1, 9.3, 2.4, 9.5, 7.4};
		
		double sum = 0;
		for  (int i = 0; i < value.length; i++) {
			sum += value[i];
		}
		
		
		double average = sum / value.length;
		System.out.println("The average is: " + average);
	}

}
