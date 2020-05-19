package arrays;
//Multidimensional Java Array

public class Ex7 {

	public static void main(String[] args) {
	
		//declaring and initializing 2D array
		int arr[][]= {{11,12,13},{21,22,23},{31,32,33}};  
		
		//printing 2D array 
		for(int i=0;arr.length>i;i++) {
			for(int j=0;arr.length>j;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
