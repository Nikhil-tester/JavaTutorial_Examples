package covariant;

class A{
	A get() {
		return this;
	}
}

class B extends A{
	B get() {
		return this;
	}

void display() {
	System.out.println("welcome to covariant return type");
}
}
public class Ex1 {

	public static void main(String[] args) {
	
	new B().get().display();
	
//	B obj=new B();
//	obj.get().display();

	}

}
