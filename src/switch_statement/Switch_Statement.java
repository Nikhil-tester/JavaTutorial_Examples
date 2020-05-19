package switch_statement;

public class Switch_Statement {

	/*
	 * Check the multiple condition together
	 */
	
	public static void main(String[] args) {
		
		int score = 93; 
		
		//byte, short, int, or char
		//If case is pass with breack, it will excute post all cases, until 'breack' key statement to given
		
		
		switch(score) {
		
		//case is nathing but the evalating the  condition
		
		case 100 :
			System.out.println("without break statement");
		
		case 93 :
			System.out.println("without break statement score = 93");	
				
		case 90 :
			System.out.println("very good");
			break; //break key word which use to come out the statement
		
		
		case 55 :
		case 60 :
			System.out.println("good");
			break;
		case 40 :
			System.out.println("ok");
			break;
			
		default :
			System.out.println("The grades are not defined");
			break;
		}

	}

}
