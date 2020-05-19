package interfaceEx;

interface Bank{
	float rateOfInt();	
}

class HDFC implements Bank{
	public float rateOfInt() {
			return 4.5f;
	}
}

class ICICI implements Bank{
	public float rateOfInt() {
		return 5.8f;
	}	
}

class PNB implements Bank{
	public float rateOfInt() {
		return 6.33f;
	}	
}

public class Ex2 {

	public static void main(String[] args) {
	
	Bank b;
	b=new HDFC();
	System.out.println("Rate Of Int : "+b.rateOfInt()+"%");
	
	b=new ICICI();
	System.out.println("Rate Of Int : "+b.rateOfInt()+"%");
	
	b=new PNB();
	System.out.println("Rate Of Int : "+b.rateOfInt()+"%");

	}

}
