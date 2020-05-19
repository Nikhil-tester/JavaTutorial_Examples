package polymorphism;

class Animal2{
	void eat() {
		System.out.println("eating....");
	}
}

class Dog4 extends Animal2{
	void eat() {
		System.out.println("playing...");
	}
}

public class Ex7 extends Dog4{

	public static void main(String[] args) {
		
	Animal2 a1=new Ex7();
	a1.eat();

	}

}
