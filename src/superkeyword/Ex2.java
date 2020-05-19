package superkeyword;

//super can be used to invoke parent class method

class Animal1{
	void eat() {
		System.out.println("eating....");
	}
}
	class Dog1 extends Animal1{
		void eat() {
			System.out.println("statt eating");
		}
		void brak() {
			System.out.println("bracking....");
		}
		void work() {
			super.eat();
			brak();
		}
}

public class Ex2 {

	public static void main(String[] args) {
	
	new Dog1().work();

	}

}
