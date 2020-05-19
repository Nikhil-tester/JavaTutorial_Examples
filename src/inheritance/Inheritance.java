package inheritance;

public class Inheritance {

/*
Inherit state and behavior from the other classes

Classes in Java can be extended
Creating new classes which retain
Characteristics of base class 
 */
/**
When every we use Inheritance all the properties of base class will be available for derived class
This example Polygon class is base class and Rectangle and Triangle is derived class.
Polygon properties access by Rectangle and Triangle class
All the public & protected method are accessible in Inheritance
 */
	
	public static void main(String[] args) {
		
		//Creating instance
		Rectangle Rec = new Rectangle();
		Triangle Tri = new Triangle();
		
		//setting up the values for a and be
		Rec.set_values(10, 10);
		Tri.set_values(10, 10);
		
		//printing the value
		System.out.println("Area of rectangle is : "+Rec.area());
		System.out.println("Area of triangle is : "+Tri.area());
		
		
	}

}
