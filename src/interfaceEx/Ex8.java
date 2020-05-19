package interfaceEx;

interface Food{
	 void show();
	 void display();
}

class Apple implements Food{

	public void show() {
		System.out.println("its a fruit");	
	}

	public void display() {
		System.out.println("good to eat green");
		
	}
}

class Cabbage implements Food{

	public void show() {
		System.out.println("its a vegitable");		
	}
	public void display() {
		System.out.println("good to eat");
	}
	
}

public class Ex8 {

	public static void main(String[] args) {
	
		Cabbage obj;
		obj=new Cabbage();
		obj.show();
		obj.display();
		
		System.out.println("* ------- * NEXT CLASS : * : NEXT LINE * ------- *");
		
		Apple obj1;
		obj1=new Apple();
		obj1.show();
		obj1.display();
		
		
	}

}
