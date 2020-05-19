package arrays;

public class MultiDimentionalArrays {

	/*
	 * arrays read 00,01,02 and 11,12,13
	 */
	
	public static void main(String[] args) {
		int firstarray[][]= {{12,13,13},{2,6,123}};
		int secondarray[][]= {{21,22,23},{2,3,4},{54,43,64},{23,33,77},{23,33,77}};
		
		System.out.println("This is the first array");
		display(firstarray);
		
		System.out.println("This is the second array");
		display(secondarray);
		
		}
		
		public static void display(int x[][]) {
		
		for(int row=0;row<x.length;row++) {
			for (int column =0;column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}		 
		}

	}


