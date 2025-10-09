package JavaPackage;

public class LambdaRunnable {

	public static void main(String[] args) {
		Runnable runnable1 = new Runnable() {
			public void run() {
			System.out.println("Hello from Runnable 1");
			}
			
		};
		new Thread(runnable1).start();
		
		Runnable runnable2 = () -> {
			System.out.println("Hello from Runnable 2");
		};
		new Thread(runnable2).start();
	
		new Thread(() -> System.out.println("Hello from Runnable 3")).start();

	}

}
