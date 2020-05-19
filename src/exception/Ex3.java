package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex3 {

	public static void main(String[] args) {
		
		PrintWriter pw;
		try {
			pw= new PrintWriter("xaj.txt");
			pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("excute rest code");

	}

}
