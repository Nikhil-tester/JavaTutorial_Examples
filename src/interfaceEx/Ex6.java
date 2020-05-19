package interfaceEx;
//Default Method in Interface

interface Drawable5{
	void draw();
	default void msg() {
		System.out.println("print message");
	}
}

class Rectangle5 implements Drawable5{
	public void draw() {
		System.out.println("print drawing");
	}
}

public class Ex6 {

	public static void main(String[] args) {
		
		Drawable5 obj=new Rectangle5();
		obj.draw();
		obj.msg();

	}

}
