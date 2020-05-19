package interfaceEx;

interface Test11{
	void test();
}

interface Showable2 extends Test11{
	void show();
}

interface Printable2 extends Showable2{
	void print();
}

public class Ex5 implements Printable2 {
	
	public void show() {
		System.out.println("show the data");	
	}

	public void print() {
		System.out.println("print the data");
	}
	
	public void test() {
		System.out.println("testing multiple interface....");
		
	}
	
	public static void main(String[] args) {

		Ex5 obj = new Ex5();
		obj.show();
		obj.print();
		obj.test();
		
	}

	
}
