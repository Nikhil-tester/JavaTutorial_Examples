package practiesPackage;

class Test{
	int id;
	int salary;
	String name;
	Test(int id, int salary, String name){
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	void test1() {
		System.out.println("hello test 1");
	}
	
	void test2() {
		this.test1();
		System.out.println("hello test 2");
	}
	
	void display(){
		System.out.println(id+" "+salary+" "+name);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Test obj=new Test(1, 1000, "voda"),
			 obj1=new Test(2, 2000, "amit");
			 obj.display();
			 obj1.display();
			 obj.test2();
			 
	}
}


