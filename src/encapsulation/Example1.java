package encapsulation;

class Test{
	private String name;

	public String getName() {
		return name;
	}

	
}

public class Example1 {
	public static void main(String[] args) {
		Test obj = new Test();
		//obj.setName("vijay");
		System.out.println(obj.getName());
	}
}
