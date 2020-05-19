package superkeyword;

class Preson{

	int id;
	String name;
	
    Preson(int id, String name) {
	this.id=id;
	this.name=name;
	
    }
}

class Employees extends Preson{
	
	float salary;
	
	Employees(int id, String name, float salary) {
		super(id, name);//reusing parent constructor 
		this.salary=salary;
		}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class Ex5 {

	public static void main(String[] args) {
	
		new Employees(10, "amit", 10000f).display();
		new Employees(11, "mayank", 20000).display();
		new Employees(12, "voda", 30000).display();
	}
}
