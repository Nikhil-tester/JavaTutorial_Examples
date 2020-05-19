package polymorphism;

class Animal1{
	void eat() {
		System.out.println("eating....");
	}
}

class Dog1 extends Animal{
	void eat() {
		System.out.println("eat green....");
	}
}

class BabyDog1 extends Dog1{
	void eat() {
		System.out.println("eat green too....");
	}
}

class NewBabyDog1 extends BabyDog1{
	void eat() {
		System.out.println("eat green also....");
	}
}

public class Ex6 extends NewBabyDog1{

	public static void main(String[] args) {
		
	Animal a1, a2, a3;
	
	a1=new Dog1();//upcasting
	a2=new BabyDog1();//upcasting
	a3=new NewBabyDog1();//upcasting
	
	a1.eat();
	a2.eat();
	a3.eat();
	
	
	
		

	}

}
