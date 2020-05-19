package interfaceEx;

interface Drawable{
	void draw();
	
}

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("drawing rectangle....");
	}
}

class Angle implements Drawable{
	public void draw() {
		System.out.println("angle rectangle....");
	}
}	

public class Ex1 {

	public static void main(String[] args) {
	
	Drawable s=new Angle();
	s.draw();

	}

}
