package variables;

public class Variable_lesson {

	public static void main(String[] args) {
		
		/*
		 byte (number, 1 byte)
		 short (number, 2 byte)
		 int (number, 4 byte)
		 long (number, 8 byte)
		 float (float number, 4 byte)
		 double (doulbe number, 4 byte)
		 char (a character, 2 byte)
		 boolean (true or false, 1 byte) */		
		
		
		byte my_byte = 100;
		
		Short my_short = 10000;
		
		int my_varibale =1000000000;
		
		float my_float=(float)4.5; // we need to convert the doulbe value to float. diff b/w float & doulbe is foalt can have 4 byte and doulbe can have 8 byte
								//(float) is type casting to doulbe value to float value
		double my_double=11.67;
		
		char my_char = 'C'; //single char
		
		boolean my_booleanT = true; 
		
		boolean my_booleanF = false;
		
		System.out.println(my_byte);
		
		System.out.println(my_short);
		
		System.out.println(my_varibale);
		
		System.out.println(my_float);
		
		System.out.println(my_double);
		
		System.out.println(my_char);
		
		System.out.println(my_booleanT);
		
		System.out.println(my_booleanF);
				
		

	}

}
