package final_j;

class Test5{

	final int speedlimit;
	
	Test5(){
		speedlimit=70;
		System.out.println(speedlimit);
	}
}

class Ex5 extends Test5 {

	public static void main(String[] args) {

	new Test5();
	}

}
