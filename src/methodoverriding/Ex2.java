package methodoverriding;

	class Bank{
		int rateofint() {
			return 0;
		}
	}
	
	class ICICI extends Bank{
		int rateofint() {
			return 8;
		}
	}
	
	class Axis extends Bank{
		int rateofint() {
			return 4;
		}
	}
	
	class HDFC extends Bank{
		int rateofint() {
			return 3;
			}
	}
	
	class Canara extends Bank{
		int rateofint() {
			return 2;
			}
	}
	
	class Ex2 {

	public static void main(String[] args) {
	
	ICICI i = new ICICI();
	Axis a = new Axis();
	HDFC h = new HDFC();
	Canara c = new Canara();
	
	System.out.println("Rate of Int ICICI : "+i.rateofint());
	System.out.println("Rate of Int AXIS : "+a.rateofint());
	System.out.println("Rate of Int HDFC : "+h.rateofint());
	System.out.println("Rate of Int CANARA : "+c.rateofint());
	
	}

}
	