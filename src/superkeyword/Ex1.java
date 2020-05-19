package superkeyword;

//super is used to refer immediate parent class instance variable.

//if a method present on super class and and child class with the same name 
//if i want to call super class method that time i will be using super key word

//if a method present on super class and and child class with the same name  
//and I want to use child class method that time i will be using this key word

class Animal{
	String color = "white";
}

class Dog extends Animal{
	String color = "Black";

void display(){
	System.out.println(color);
	System.out.println(super.color);
}
}

public class Ex1 {

	public static void main(String[] args) {
	
	new Dog().display();

	}

}
