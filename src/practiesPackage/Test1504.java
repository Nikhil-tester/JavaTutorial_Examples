package practiesPackage;

class Emp{
	String name;
	int id;	
	Emp(String name, int id){
		this.name=name;
		this.id=id;
	}
}
class Address extends Emp{
	String deptm;
	Address(int id, String name,String deptm){
		super(name,id);
		this.deptm=deptm;
	}
	void display() {
		System.out.println(id+" "+name+" "+deptm);
	}
}
public class Test1504 {
	public static void main(String[] args) {
		Address obj=new Address(9110, "voda", "BI");
		obj.display();
	}
}
