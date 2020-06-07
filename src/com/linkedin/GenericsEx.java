package com.linkedin;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx {

	public static void main(String[] args) {
		//ex1
		List names = new ArrayList();
		names.add("Hoon");
		String name = (String) names.get(0);
		System.out.println("First name: " + name);
		
		//ex2
		//adding the String generics ensures that only Strings are added
		//to the list!
		List<String> names2 = new ArrayList();
		names2.add("Kihoon");
		String name1 = names2.get(0);
		System.out.println(name1);
		
	}
	

}
