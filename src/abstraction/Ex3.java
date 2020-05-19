package abstraction;

abstract class Bike1{
	Bike1(){
		System.out.println("bike created....");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("change gear....");
	}
	
	abstract void stop();
}

//Creating a Child class which inherits Abstract class
class Honda extends Bike1{
	void run() {
		System.out.println("running....");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

class BikeStop extends Bike1{
	void stop() {
		System.out.println("Stop bike....");
	}
	void run() {
		System.out.println("testing");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		Bike1 obj=new Honda(),
			  obj1=new BikeStop();
		
		obj.run();
		obj.changeGear();
		obj.run();
		obj1.stop();
		obj1.run();
	}

}
