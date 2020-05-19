package arrays;

public class Arrays {
	
	/*
Arrays is the same as variables but it can store more the one values at a time 
but only one condition same kindly of values stores in a array   
that is 10 int can be store but , 5 int and 5 double can not be store
store only same kindly of data type

{1,2,3} are the elements of array
index of the array provide under [], while utilizing , position index start from 0,1,2,3.... 
	 */

	public static void main(String[] args) {
		
		int[]myintarray = {191,221,344,401,520,109,270,780}; //Preffered way to defining arrays
		
		
		// int myintarray1[]= {1,2,3,4,5};  //not Preffered way to defining arrays
		
		/*
		Most populare way of defining array

		int[] myIntArray = new int[3];
		int[] myIntArray = {1,2,3};
		int[] myIntArray = new int[]{1,2,3};
		 */

		int index =0;
		while(index <5){
		System.out.println(myintarray[index]); //index 4 mean 0,1,2,3,4, ->5
		index++;
	}
	}
	

}
