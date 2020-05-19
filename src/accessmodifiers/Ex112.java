package accessmodifiers;

//read only

class Test201{
	private String collegeName="RCET";

	public String getCollegeName() {
		return collegeName;
	}
	
}
public class Ex112 {
	public static void main(String[] args) {
		
		Test201 obj201=new Test201();
		System.out.println(obj201.getCollegeName());
	}
	
}


