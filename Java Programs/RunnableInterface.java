package JavaPackage;

class MyRunnable implements Runnable {
	public void run() {
		for (int i =1; i <=5; i++) {
			System.out.println("Thread: " + i);
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
		//for(int i = 1);

	}

}


