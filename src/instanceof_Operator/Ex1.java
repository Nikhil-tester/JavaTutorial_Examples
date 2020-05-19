package instanceof_Operator;
//The instanceof in java is also known as type comparison operator 
//because it compares the instance with type. It returns either true or false. 
//If we apply the instanceof operator with any variable that has null value, it returns false.

public class Ex1 {

	public static void main(String[] args) {
	
	Ex1 s = new Ex1();
	System.out.println(s instanceof Ex1);//compares the instance with type, and It returns either true or false

	}

}
