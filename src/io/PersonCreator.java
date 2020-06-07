package io;

import java.util.Scanner;

public class PersonCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.next();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter your phone number: ");
		Long phonenumber = scanner.nextLong();
		
		Person person = new Person(name, age, phonenumber);
		
		
		


	}

}
