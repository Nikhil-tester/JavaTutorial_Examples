package practiesPackage;

public class P1 {
	int id;
	String name;
	
	P1(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public static void main (String[] arg) {
	
	P1 obj = new P1(11, "amit");
		
	System.out.println(obj.id+" "+obj.name);
	
		

	}
	
	
}
