package io;

public class Person {
	private String name;
	private int age;
	private long phonenumber;
	
	public Person(String name, int age, long phonenumber) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		System.out.println("Name: " + name + " age: " + age + " phone number: " + phonenumber);
	}
	
	
}
