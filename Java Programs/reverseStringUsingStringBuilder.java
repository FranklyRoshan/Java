package JavaPrograms;

public class reverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String a = "Franklu Roshan";
		StringBuilder b = new StringBuilder();
		
		b.append(a);
		b.reverse();
		
		System.out.println(b);

	}

}
