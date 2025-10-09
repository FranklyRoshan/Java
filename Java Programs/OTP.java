package JavaPrograms;

import java.util.*;

public class OTP {

	static char[] otps(int len) {
		System.out.println("Generating OPT Using random: ");
		System.out.print("Your OTP is: ");
		
		String num = "0123456789";
		
		Random rndm_method = new Random();
		
		char[] pass = new char[len];
	
	for(int i=0; i<len; i++) {
		pass[i] = num.charAt(rndm_method.nextInt(num.length()));
	}
	return pass;
	}
	
	
	public static void main(String[] args) {
		int length = 4;
		System.out.println(otps(length));
	}
}
