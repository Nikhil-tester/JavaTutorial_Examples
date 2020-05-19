package polymorphism;

class Shape{
	void draw() {
		System.out.println("drawing....");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle....");
	}
}

class Cricle extends Shape{
	void draw() {
		System.out.println("drawing Cricle....");
	}
}

class Line extends Shape{
	void draw() {
		System.out.println("drawing Line....");
	}
}

public class Ex3 {

	public static void main(String[] args) {
	
	Shape s;
	
	s=new Rectangle();
	s.draw();
	
	s=new Cricle();
	s.draw();
	
	s=new Line();
	s.draw();
	
	

	
		

	}

}
