package classandobjects;

//accessing member through reference variable

class test{
	
	//instance
	int rollno;
	String name;
	
	//methods
	void insertrecord(int r, String n) {
		rollno=r;
		name=n;
}
	//methods
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}

public class Ex2 extends test{

	public static void main(String[] args) {
		
		//create object
		Ex2 s1=new Ex2();
		Ex2 s2=new Ex2();
		
		//through reference variable
		s1.insertrecord(11,"Amit");
		s2.insertrecord(12,"Mayak");
		
		//calling method
		s1.displayInformation();
		s2.displayInformation();
	}

	}
	


