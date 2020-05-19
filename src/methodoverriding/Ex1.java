package methodoverriding;

//Creating a parent class.  
class Test{
	
	//defining a method  
	void car() {
		System.out.println("car is running");
	}
}

//Creating a child class
public class Ex1 extends Test{

	//defining the same method as in the parent class 
	void car() {
		System.out.println("car stop");
	}
	public static void main(String[] args) {
	
	//creating object 
	Ex1 obj=new Ex1();
	//calling object
	obj.car();

	}

}
