package constructor;

public class Constructor_Exm {

	int num1;
	int num2;
	int result;
	
	//Default Constructor
	public Constructor_Exm() {
		num1=5;
		num2=5;
		result=num1+num2;
		
	}
	
	//Parameteries Constructor
	public Constructor_Exm(int n) {
		num1=n;
		num2=n;
		result=num1+num2;
				
	}
	
	//multiple parameter Constructor
	public Constructor_Exm(int n, int m) {
		num1=n;
		num2=m;
		result=num1+num2;
				
	}
	//multiple data type parameter Constructor
	public Constructor_Exm(int n, double m) {
		num1=n;
		num2=(int)m;
		result=num1+num2;
				
	}
	
	public static void main(String[] args) {
	
		Constructor_Exm obj = new Constructor_Exm();
		System.out.println("Default Constructor output is " +obj.result);
		
		Constructor_Exm obj1 = new Constructor_Exm(7);
		System.out.println("Parameteries Constructor output is " +obj1.result);
		
		Constructor_Exm obj2 = new Constructor_Exm(7,8);
		System.out.println("Parameteries Constructor with one data type output is " +obj2.result);
		
		Constructor_Exm obj3 = new Constructor_Exm(7,9.6);
		System.out.println("Parameteries Constructor with two data type output is " +obj3.result);

	}

}
