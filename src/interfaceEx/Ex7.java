package interfaceEx;

interface Drawable6{
	void draw();
	
	static int cube(int x) {
		return (x*x*x);
	}
}

class Rectangle1 implements Drawable6{

	public void draw() {
		System.out.println("print Rectangle....");
	}
}

public class Ex7 {

	public static void main(String[] args) {
	
		Drawable6 obj = new Rectangle1();
		obj.draw();
		System.out.println("Print x cube : "+ Drawable6.cube(3));

	}

}
