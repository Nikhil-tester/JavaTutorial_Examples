package inheritance_example;

public class apple {

/*
Why - not to weight same method in each class
food class - storing same method which has tuna and potpie class
all the variable and method present on food class , will be expanded/inheritance to tuna and potpie class
food is super class
tuna and potpie is sub class
public & protected class only inherited to the derived classes


overriding the class - base class properties overriding on derived class
In this example fool class properties overriding on tune class
overriding the class - just create it again with the same method name

Important - if tuna class extands potpie , and potpie class extands food class, then all class has the food class properties its a hierarchy



 */

	public static void main(String[] args) {
		
		//creating the object
		tuna tunaObject = new tuna();
		potpie potpieObject = new potpie();
		
		//class the object
		tunaObject.eat();
		potpieObject.eat();

	}

}
