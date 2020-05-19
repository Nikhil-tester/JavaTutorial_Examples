package static_j;

//Java Program to get the cube of a given number using the static method  

public class Ex5 {

	static int cube(int x) {
		return x*x*x;
	}
	
	
	public static void main(String[] args) {
		
		int resutl=Ex5.cube(5);
		System.out.println(resutl);

	}

}
