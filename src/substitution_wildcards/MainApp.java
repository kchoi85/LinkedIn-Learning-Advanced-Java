package substitution_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<Building> buildings = new ArrayList();
		buildings.add(new Building());
		buildings.add(new Building());
		printBuilding(buildings);
		
		//List of Office is not a subtype of list of buildings!
		List<Office> office = new ArrayList();
		office.add(new Office());
		office.add(new Office());
		printBuilding(office);
		//compile error - one solution could be create a new method for office and house
		//but better solution exists --> wildcards
		
		//List of houses
		List<House> house = new ArrayList();
		house.add(new House());
		house.add(new House());
		printBuilding(house);
		
		addHouseToList(house);
		addHouseToList(buildings);
	}
	//original: static void printBuilding(List<Building> buildings)
	//List<? extends Building> buildings
	static void printBuilding(List<? extends Building> buildings) {
		for(int i=0; i<buildings.size(); i++) {
			System.out.println(buildings.get(i).toString() + " " + (i+1));
		}
		System.out.println();
	}
	
	//original:
	//static void addHouseToList(List<House> buildings)
	//since you could not do:
	//buildings.add(new Building());
	static void addHouseToList(List<? super House> buildings) {
		buildings.add(new House());
		System.out.println();
	}
}
