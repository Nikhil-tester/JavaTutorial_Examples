package inheritance;

//Single Inheritance Example

class Dog{
	void barck() {
		System.out.println("Barking...");
	}
}

class Cat extends Dog{
	void eat() {
		System.out.println("mewoo...");
	}
}

public class Ex2 {

	public static void main(String[] args) {
	
	Cat s1=new Cat();
	s1.barck();
	s1.eat();
	
	}
}
