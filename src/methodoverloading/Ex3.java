package methodoverloading;

//Example of Method Overloading with TypePromotion

public class Ex3 {

	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
	Ex3 obj=new Ex3();
	
	obj.sum(10, 20);
	obj.sum(10, 20, 30);

	}

}
