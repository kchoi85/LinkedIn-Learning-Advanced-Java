package com.linkedin;

public class VarArgs {

	public static void main(String[] args) {
		String item1 = "Apple";
		String item2 = "Pear";
		String item3 = "Banana";
		//String[] shopList = {"Tea", "Milk", "Cereal"};
		//now I can put the array into the method
		printShoppingList(item1, item2, item3);
		//printShoppingList(shopList);
		printShoppingList("Tea", "Milk", "Cereal");
	}
	
	private static void printShoppingList(String... items) {
		System.out.println("SHOPPING LIST");
		for (int i=0; i < items.length; i++) {
			System.out.println(i + 1 + ":" + items[i]);
		}
	}
}
