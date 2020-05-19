package polymorphism;
class Animal{
	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("eating veg....");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("eating rat....");
	}
}
class Loin extends Animal{
	void eat() {
		System.out.println("eating meat....");
	}
}

public class Ex4 {

	public static void main(String[] args) {
	
	Animal a;
	
	a = new Dog();//upcasting
	a.eat();
	
	a = new Cat();//upcasting
	a.eat();
	
	a = new Loin();//upcasting
	a.eat();
	
	}
}
