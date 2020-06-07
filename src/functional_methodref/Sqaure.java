package functional_methodref;

public class Sqaure {

	int sideLength;

	public Sqaure(int sideLength) {
		super();
		this.sideLength = sideLength;
	}
	
	public int calculateArea() {
		return sideLength*sideLength;
	}
	
	
}
