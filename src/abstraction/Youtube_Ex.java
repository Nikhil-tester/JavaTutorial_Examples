package abstraction;

abstract class Vehicle{
	abstract void start();
}

class Car extends Vehicle{
	public void start() {
		System.out.println("car starts with key");
	}
}

class Scooter extends Vehicle{
	public void start() {
		System.out.println("scooter start with kick");
	}
}

public class Youtube_Ex {

	public static void main(String[] args) {

	Vehicle obj;
	obj= new Scooter();
	obj.start();
	obj=new Car();
	obj.start();
	}
}
