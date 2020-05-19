package abstraction;

interface Drawable{
	void drow();
}

class Rectangle implements Drawable{
	public void drow() {
		System.out.println("Rectangle...");
	}
}

class Circle implements Drawable{
	public void drow() {
		System.out.println("Circle...");
	}
}

class Example1{
	public static void main(String[] args) {
	Drawable d = new Circle();
	d.drow();
	}
}
