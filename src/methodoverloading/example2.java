package methodoverloading;

public class example2 {

	public static void main(String[] args) {
		
		example2 ADD = new example2();
		System.out.println("Sum of two double is " +ADD.ADD(1.5, 2.7));
		System.out.println("Sum of three int is " +ADD.ADD(2, 4, 6));

	}
	
	public int ADD(int a, int b) {
		return a+b;
	}
	
	public int ADD(int a, int b, int c) {
		return a+b+c;
	}
	public int ADD(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public double ADD(double a, double b) {
		return a+b;
	}
	public double ADD(double a, double b, double c) {
		return a+b+c;
	}
	public double ADD(double a, double b, double c, double d) {
		return a+b+c+d;
	}
	
	
	
	
	
	

}
