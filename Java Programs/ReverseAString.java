package JavaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String a = "Frankly Roshan";
		char[]b = a.toCharArray();
		for (int i = b.length -1; i >= 0; i--)
			
			System.out.print(b[i]);

	}

}
