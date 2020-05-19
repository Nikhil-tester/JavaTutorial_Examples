package Inheritance_Example1;

public class Professor extends Person{
	public Professor(String firstName, String lastName) {
		super(firstName, lastName);
	}
	//overriding method
	public void print() {
		System.out.println("Professor Details :");
		super.print();
	}	
	}

