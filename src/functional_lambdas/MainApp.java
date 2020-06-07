package functional_lambdas;

public class MainApp {
	
	///lambdas are quick/simple way of implementing functional interfaces

	public static void main(String[] args) {
		Greetingmsg gm = new Greetingmsg() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		
		gm.greet("Kihoon");
		
		Greetingmsg gm2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		
		gm2.greet("Beeny");
		
		Msgprinter mp = () -> {
			System.out.println("tis a msg");
		};
		
		mp.msgPrinter();
	}
}
