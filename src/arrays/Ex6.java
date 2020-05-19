package arrays;
//Returning Array from the Method

public class Ex6 {

	//creating method which returns an array  
	static int[] get() {
		return new int[] {10,20,30,40};
	}
	
	public static void main(String[] args) {
		
		//calling method which returns an array  
		int arr[]=get();
		
		//printing the values of an array  
		for(int i=0;arr.length>i;i++)
			System.out.println(arr[i]);
	}
}
