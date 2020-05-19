package practiesPackage;

public class P2 {

	int id;
	String name;
	float salary;
	
	void P3(int id, String name, float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	 void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
	public static void main(String[] args) {
	
	P2 obj=new P2();
	
	obj.P3(11, "amit", 12000);

	obj.display();
	
	
	}

}
