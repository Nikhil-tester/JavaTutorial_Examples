package instanceof_Operator;
//downcasting with instanceof

class Animal_3{	
}

public class Ex3_Animal extends Animal_3{
	
	static void method(Animal_3 a) {
		if( a instanceof Ex3_Animal) {
			Ex3_Animal d = (Ex3_Animal)a; //downcasting
			System.out.println("ok downcasting preformed");
		}
	}

	public static void main(String[] args) { 
	
	Animal_3 a = new Ex3_Animal();
	Ex3_Animal.method(a);

	}

}
