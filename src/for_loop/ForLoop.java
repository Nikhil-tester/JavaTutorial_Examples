package for_loop;

public class ForLoop {

	/*
	 * for loop is same as while loop or do while loop. this execute the statement until condition matches
	 * but here on for loop we have more control over the condition declared
	 */
	
	public static void main(String[] args) {
		
		int[] myintarray = {191,221,344,401,520,109,270,780};
		
		/*int index =0;
		while(index <5){
		System.out.println(myintarray[index]); //index 4 mean 0,1,2,3,4, ->5
		index++;
	}*/
		
		/*
		 * for ( first is initialzation; second is expression ; thrid is increment; )
		 * initalzation condition and increment all provided under for loop,
		 * while and do while loop all those provide before start the loop
		 * 
		 */
		
		for(int index=0; index <8 ; index++) {
			
			System.out.println(myintarray[index]);
			
		}
		
		System.out.println("--------------other way of for loop---------------------");
		
		/*
		 * second way of doing loop
		 * this is for each loop
		 * 
		 * for : bi directional increment or declarment
		 * for each : all increment order 
		 */
		for (int element : myintarray)
		{
			System.out.println(element);
		}
		
	}

}
