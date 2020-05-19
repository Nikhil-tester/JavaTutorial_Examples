package arrays;
//Anonymous Array in Java

public class Ex5 {
	
	//creating a method which receives an array as a parameter 
	static void printArray(int arr[]) {
		for(int i=0;arr.length>i;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		
		//passing anonymous array to method 
		printArray(new int[]{10,20,30});
	}
}
