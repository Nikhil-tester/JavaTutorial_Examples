package classandobjects;

class Test1{
	
	int id;
	String name;
	float salary;
	
	void insert (int i, String n, float s) {
		id =i;
		name=n;
		salary=s;
	}
	
	void display() {
		System.out.println("Employee ID is : "+id+" || Name is : "+name+" || And Salary is : "+salary);
	}

}
public class Ex_4 {

	public static void main(String[] args) {
		
		Test1 s1=new Test1();
		Test1 s2=new Test1();
		
		s1.insert(01, "Amit", 10000);
		s2.insert(02, "Mayak", 20000);
		
		s1.display();
		s2.display();
		

	}

}
