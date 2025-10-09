package JavaPrograms;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) {
		
		String a = "Frankly";
		
		StringBuffer b = new StringBuffer(a);
		b.reverse();
		System.out.println(b);
	}

}
