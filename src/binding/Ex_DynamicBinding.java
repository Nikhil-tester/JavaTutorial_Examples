package binding;

class Animal{
	void eat() {
		System.out.println("animal is eating....");
	}
}

public class Ex_DynamicBinding extends Animal {

	void eat() {
		System.out.println("dog is eating....");
	}
	
	public static void main(String[] args) {
	
	Animal a=new Ex_DynamicBinding();//upcasting
	a.eat();

	}

}
