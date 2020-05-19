package instanceof_Operator;
//Downcasting without the use of java instanceof

class Animal4{	
}

public class Ex4_Dog extends Animal4 {

	static void method(Animal4 a) {
		
		Ex4_Dog d = (Ex4_Dog)a;//downcasting
		System.out.println("ok downcasting preformed....");
	}
	
	public static void main(String[] args) {
	
	Animal4 a = new Ex4_Dog();
	Ex4_Dog.method(a);
	}
}
