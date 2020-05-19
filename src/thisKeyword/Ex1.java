package thisKeyword;

class Example{
	
	int rollno;
	String name;
	float fee;
	
	Example(int rollno, String name, float fee) {
		
		//this: to refer current class instance variable
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Example s1=new Example(10, "Amit", 10000),
				s2=new Example(11, "mayank", 20000),
				s3=new Example(13, "voda", 30000);
		
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
