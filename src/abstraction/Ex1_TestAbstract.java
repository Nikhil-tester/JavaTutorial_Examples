package abstraction;

abstract class Shape{
	abstract void draw();
	abstract void test();
	
}

class Rectable extends Shape{
	void draw() {
		System.out.println("drawind rectangle....");
	}

	
	void test() {
		// TODO Auto-generated method stub
		
	}
}

class Line extends Shape{
	void draw() {
		System.out.println("drawing line....");
	}
	void test() {
		
	}
}

 class Plane extends Shape{
	void draw() {
		System.out.println("drawing Plane....");
	}

	
	void test() {
		System.out.println("testing....");
		
	}
}

public class Ex1_TestAbstract {

	public static void main(String[] args) {
		
		Shape obj= new Plane();
		obj.draw();
		obj.test();

	}

}
