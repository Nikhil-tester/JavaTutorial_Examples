package polymorphism;
//Java Runtime Polymorphism with Data Member

class Test5{
	int speedlimit=50;
}
class Test6 extends Test5{
	int speedlimit=70;
}

public class Ex5 extends Test6 {

	public static void main(String[] args) {
	
	Test5 a = new Test6();//updating the data member
	System.out.println("Speed Limit is : "+a.speedlimit);
	
	}
}
