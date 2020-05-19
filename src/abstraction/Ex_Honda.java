package abstraction;

abstract class Bike{
	abstract void run();
}

public class Ex_Honda extends Bike{

	public void run() {
		System.out.println("running safely....");
	}
	
	public static void main(String[] args) {
	
	Bike obj = new Ex_Honda();
	obj.run();	
	

	}

}
