package threadExample2;

public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new RunnableEx());
		thread1.start();
		
		Thread thread2 = new Thread(new RunnableEx());
		thread2.start();
	}

}
