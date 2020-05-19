package inheritance;

class Testclass {
	float salary = 40000;
	int bonus = 10000;
	int result = (int) (salary+bonus);
}

public class Ex1 extends Testclass{

	
	
	public static void main(String[] args) {
	
	Ex1 s1=new Ex1();
	
	System.out.println("Salary is "+s1.salary);
	System.out.println("Bonus is "+s1.bonus);
	System.out.println("Total is "+s1.result);
	
	
		
	}

}
