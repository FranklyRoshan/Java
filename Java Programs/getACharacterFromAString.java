package JavaPrograms;

public class getACharacterFromAString {
	public static  char
	getCharFromString (String str, int index)
	{
		return str.charAt(index);}
	
	public static void main (String[] args) {
		String str = "Frankly Roshan";
		
		int index = 10;
		
		char ch = getCharFromString(str, index);
		
		System.out.println("character from " + str + " at index " + index + " is " + ch);
	
	}
}

