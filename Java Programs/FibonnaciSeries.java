package JavaPackage;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int limit = 10;
		
		System.out.println("Fibonnaci Series up to " + limit + ":");
		for(int i = 0; i <= limit; i++) {
			System.out.print(fibonnaci(i) +" ");
		}
	}
	
	public static int fibonnaci(int num) {
		if (num <= 1) {
			return num;
		}
		
		int prev1 = 0;
		int prev2 = 1;
		int fib = 0;
		
		for (int i = 2; i <= num; i++) {
			fib = prev1 + prev2;
			prev1 = prev2;
			prev2 = fib;
		}
		
		return fib;
	}

}
