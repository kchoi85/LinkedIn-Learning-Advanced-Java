package linkedlists;

import java.util.LinkedList;

public class MainApp {
	//Linked list allows faster addition/manipulation of elements
	//Each element stores the reference to the next element
	//Takes more memory than ArrayList
	//When in doubt, use ArrayList, however, if many addition/deletion of elements, then use LinkedList

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList myList = new LinkedList();
		LinkedList<String> myList = new LinkedList();
		myList.add("a"); //index 0
		myList.add("b"); 
		myList.add(1, "c"); //adds "c" at index1
		System.out.println(myList);
		myList.remove("b");
		System.out.println(myList);
	}

}
