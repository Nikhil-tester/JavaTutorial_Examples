package clone;

public class Ex1 {

	int rollNo;
	String name;
	
	Ex1(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
	
		try {
			
			Ex1 obj = new Ex1(101, "Amit");
			Ex1 obj1=(Ex1)obj.clone();
			
			System.out.println(obj.rollNo+" "+obj.name);
			System.out.println(obj1.rollNo+" "+obj1.name);
		
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println("xxx");
		}

	}

}
