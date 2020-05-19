package inheritance;

/*
inheriting polygon class
Rectangle class is inheriting polygon class
Polygon class is derived class, Rectangle class which driving
Polygon is the base class
When every extends any class, then all properties are accessible to derived class (public, protected *not private)
Derived class or sub class same

*/

public class Rectangle extends Polygon{ 

	public double area() {
		return (height*width);
	}
}
