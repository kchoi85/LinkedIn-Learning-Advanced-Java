package functional_interface;

public class MainApp {

	public static void main(String[] args) {
		Greetingmsg gm = new Greetingmsg() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		
		gm.greet("Kihoon");
	}
}
