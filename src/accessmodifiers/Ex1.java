package accessmodifiers;

class Ex11{
	private int data=20;
	private void mgs() {
		System.out.println("private class");
	}
}

public class Ex1 {

	public static void main(String[] args) {
	
	Ex11 obj = new Ex11();
	//obj.mgs()-> Compile time error
	//System.out.println(obj.data); -> Compile time error
	}

}
