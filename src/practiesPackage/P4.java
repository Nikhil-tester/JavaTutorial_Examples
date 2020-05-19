package practiesPackage;

public class P4 {

	int id;
	String name;
	static String collegeName;
	
	P4(int id, String name, String collegeName){
		this.id=id;
		this.name=name;
	}
	
	void change() {
		collegeName="ITS";
	}
	
	void display() {
		System.out.println(id+" "+name+" "+collegeName);
	}
	
	public static void main(String[] args) {
		
	P4 obj = new P4(1, "amit", "RCET");
	
	obj.collegeName="DPS";
	
	obj.display();
	
	obj.change();
	
	obj.display();	
	}
}
