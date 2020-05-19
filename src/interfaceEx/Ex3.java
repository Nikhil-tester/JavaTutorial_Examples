package interfaceEx;
//Multiple inheritance is not supported through class in java, but it is possible by an interface

interface Printable{
	void print();
}

interface Showable{
	void show();
}

public class Ex3 implements Printable, Showable{

	public void show() {
		System.out.println("show the data");
	}

	public void print() {
		System.out.println("print the value");
	}
	
	public static void main(String[] args) {
	
	Ex3 obj = new Ex3();
	obj.show();
	obj.print();
	
	}
}
