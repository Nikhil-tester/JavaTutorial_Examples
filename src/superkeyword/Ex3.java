package superkeyword;

//super is used to invoke parent class constructor.

class AnimalOne{
	AnimalOne(){
		System.out.println("animal is created....");
	}
}

class DogOne extends AnimalOne{
	DogOne(){
		super();//Imp
	}
	void display() {
		System.out.println("dog is created....");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		
	new DogOne().display();
	}

}
