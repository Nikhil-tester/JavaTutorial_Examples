package switch_statement;

public class TPoint_Exm4 {
	
	
	public static void main(String[] args) {    
	    
		//Java Switch Statement with String
		
		//Declaring String variable  
	
		String levelString="Expert";  
		
		int level=0;  
	    
		//Using String in Switch expression  
		switch(levelString){    
	    //Using String Literal in Switch case  
	    
		case "Beginner": level=1;  
	    break;    
	    
		case "Intermediate": level=2;  
	    break;    
	    
		case "Expert": level=3;  
	    break;    
	    
		default: level=0;  
	    break;  
	    }    
	    
		System.out.println("Your Level is: "+level);  
	}    

}
