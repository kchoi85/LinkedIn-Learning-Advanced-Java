package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	//order of hashmap is retained if we use LinkedHashMap
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> phonebook = new LinkedHashMap();
		phonebook.put("Kihoon", 123123);
		phonebook.put("Hoon", 123222);
		System.out.println(phonebook);
		
		System.out.println("Kihoon's phone #: " + phonebook.get("Kihoon"));
	
		System.out.println("\nList of contacts in phonebook:");
		for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
