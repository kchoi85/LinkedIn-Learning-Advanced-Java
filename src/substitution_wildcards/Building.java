package substitution_wildcards;

public class Building {
	public int numberofRooms = 7;
	
	@Override
	public String toString() {
		return("building");
	}

	public int getNumberofRooms() {
		return numberofRooms;
	}

	public void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
	}
	
}
