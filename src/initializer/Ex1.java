package initializer;

public class Ex1 {

	int speed;
	
	Ex1(){
		System.out.println("speed is"+speed);
	}
	
	{speed=100 ;}//Instance initializer block
	
	public static void main(String[] args) {
	new Ex1();
	new Ex1();
	}
}
