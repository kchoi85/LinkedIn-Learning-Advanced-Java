package substitution_principle;

public class MainApp {

	public static void main(String[] args) {
		Building building = new Building();
		Office office = new Office();
		build(building);
		build(office);
		//office is a subtype of building, hence this works
		//however list of type office is not a subtype of list type of building
		//so adding office object to the list<Buildings> does work
		//substitution principle does not apply to lists
		
	}
	
	static void build(Building building) {
		System.out.println("Constructing a new " + building.toString());
	}
	
	static void build(Office office) {
		System.out.println("Constructing a new " + office.toString());
	}

}
