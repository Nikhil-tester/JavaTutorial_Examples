package constructor;

public class Constructor {

	/*
	 * constructor name should be same as class name
	 * constructor never return any value
	 * use to initials the values in a class
	 * 
	 * constructor are member method in a class which has same name as class, constructor never return anything
	 * constructor can take parameters (optional)
	 * we can have multiple constructor in a class (by changing parameters)
	 * not required to call constructor, automatically constructor will call the method once its created
	 * 
	 * In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
	 * 
It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.
	 */
	
	public static void main(String[] args) {
	
		Cube cube1 = new Cube(); //not passing any value on constructor class ++ Default constructor ++ no-arg constructor,
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(20, 30, 40);//passing value on constructor class ++ Parameterizes Constructor
		System.out.println(cube2.getCubeVolume());
	}

}
