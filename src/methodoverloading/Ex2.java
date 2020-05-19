package methodoverloading;

//Method Overloading: changing data type of arguments

class Adders{
	static int Adds(int a, int b) {
		return(a+b);
	}
	
	static double Adds(double a, double b, double c) {
		return(a+b+c);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		System.out.println(Adders.Adds(10, 20));
		System.out.println(Adders.Adds(10.11,20.22,30.33));


	}

}
