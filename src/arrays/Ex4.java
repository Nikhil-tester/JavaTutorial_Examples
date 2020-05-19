package arrays;
//Passing Array to a Method in Java
//We can pass the java array to method so that we can reuse the same logic on any array.

public class Ex4 {

	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;arr.length>i;i++)
			if(min>arr[i])
				min=arr[i];
		
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int arr[]= {22,21,32,44,11,3,2,1,77};
		min(arr);

	}

}
