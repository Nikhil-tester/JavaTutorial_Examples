package thisKeyword;

class Example1{
	int rollno;
	String name;
	float fee;
	
	public Example1(int r, String n, float f) {
		
		//If local variables(formal arguments) and 
		//instance variables are different, there is no need to 
		//use this keyword like in the following program:
		
		rollno=r;
		name=n;
		fee=f;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}


public class Ex2 {

	public static void main(String[] args) {
	
	Example1 s1=new Example1(10, "amit", 10000),
			 s2=new Example1(11, "voda", 20000),
			 s3=new Example1(12, "mayank", 30000);
	
	s1.display();
	s2.display();
	s3.display();
	
	}
}
