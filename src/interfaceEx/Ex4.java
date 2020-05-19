package interfaceEx;
interface Showable1{
	void print();
}
interface Printable1{
	void print();
}

public class Ex4 implements Showable1, Printable1 {
	
	public void print() {
		System.out.println("print the data....");
	}
	
	public static void main(String[] args) {
		Ex4 obj=new Ex4();
		obj.print();
	}
}
