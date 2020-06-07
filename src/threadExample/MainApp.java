package threadExample;

public class MainApp {

	public static void main(String[] args) {
		//System.out.println(Thread.activeCount());
		ThreadExample thread1 = new ThreadExample();
		thread1.setName("My first thread");
		thread1.start();
		
		ThreadExample thread2 = new ThreadExample();
		thread2.setName("My second thread");
		thread2.start();
	}

}

