package abstraction;

abstract class Bank{
	abstract int getRateInt();
}

class ICICI extends Bank{
	int getRateInt() {
		return 7;
	}
}

class HDFC extends Bank{
	int getRateInt() {
		return 8;
	}
}

class PNB extends Bank{
	int getRateInt() {
		return 9;
	}
}

public class Ex2 {

	public static void main(String[] args) {
	
	Bank obj;
	obj= new PNB();
	System.out.println("Print RateOfInt : "+obj.getRateInt()+"%");
	obj=new HDFC();
	System.out.println("Print RateOfInt : "+obj.getRateInt()+"%");
	obj=new ICICI();
	System.out.println("Print RateOfInt : "+obj.getRateInt()+"%");
	
	

	}

}
