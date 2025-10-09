package JavaPackage;

class MyThread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread: " + i);
	} 
}

public class Thread extends MyThread {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		//thread.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main: " + i);
		}

	}
	
}

}
