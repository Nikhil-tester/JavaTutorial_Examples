package polymorphism;

class Bank{
	float rateofInt() {
		return 0;
	}
}

class HDFC extends Bank{
	float rateofInt() {
		return 5.2f;
	}
}
class Axis extends Bank{
	float rateofInt() {
		return 10.5f;
	}
}
class Canara extends Bank{
	float rateofInt() {
		return 6.33f;
	}
}

public class Ex2 {

	public static void main(String[] args) {
	
	Bank b;
	b = new HDFC();//upcasting
	System.out.println("Rate Of Int "+b.rateofInt());
	b = new Axis();//upcasting
	System.out.println("Rate Of Int "+b.rateofInt());
	b = new Canara();//upcasting
	System.out.println("Rate Of Int "+b.rateofInt());
	
	}
}
