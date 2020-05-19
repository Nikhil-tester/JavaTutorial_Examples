package final_j;
//Java final variable

public class Ex1 {

	final int speedlimit=1000;
	
	void run() {
		//speedlimit=500;// due to final instance is declearded.
	}
	
	public static void main(String[] args) {
	
		new Ex1().run();

	}

}
