package functional_methodref;

public class Main {

	public static void main(String[] args) {
		Sqaure s = new Sqaure(4);
		
		/* lambda:
		 * Shape shape = (Sqaure sqaure) -> { return sqaure.calculateArea(); };
		 */
		
		Shape shape = Sqaure::calculateArea;
		
		System.out.println(shape.getArea(s));
	}
}
