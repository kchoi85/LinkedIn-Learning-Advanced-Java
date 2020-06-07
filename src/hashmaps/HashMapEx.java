package hashmaps;

import java.math.BigDecimal;
import java.util.HashMap;

public class HashMapEx {

	//HashMaps are unordered
	//entries are stored by their contents
	//do not allow duplicate keys
	public static void main(String[] args) {
		
		HashMap<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Kihoon", 12345);
		phoneBook.put("Test", 123123);
		//phoneBook.put("Test", 222222); //this wouldn't work
		phoneBook.put(null, 000);
		if(phoneBook.containsKey("Kihoon")) {
			phoneBook.remove("Kihoon");
		}
		//this erases the hashmap
		//phoneBook.clear();
		System.out.println(phoneBook);
	}

}
