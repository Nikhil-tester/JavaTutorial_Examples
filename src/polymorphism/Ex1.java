package polymorphism;
class Bike{
	void run() {
		System.out.println("running....");
	}
}

public class Ex1 extends Bike{
	
	void run() {
		System.out.println("stop....");
	}

	public static void main(String[] args) {
	
	Bike P= new Ex1();//upcasting
	P.run();

	}

}
