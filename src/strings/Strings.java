package strings;

public class Strings {

	public static void main(String[] args) {
	
	/*
	 * Strings is a sequence of the characters 
	 * strings is a character array
	 * 
	 * string present on java.lang.String package
	 */
		
	String myString ="Hello"+ " " + "world"; //concatenating strings and storing multiple data
	int myStringLenth = myString.length();
	String myStringinLowercase = myString.toLowerCase();
	String myStringinUpperCase = myString.toUpperCase();
	
	System.out.println("String Values : "+ myString);
	System.out.println("String Count : " +myStringLenth);
	System.out.println("String in LowerCase : " +myStringinLowercase);
	System.out.println("String in UpperCase : "+myStringinUpperCase);
	System.out.println("Replaceing o to s on string : "+ myString.replace('o', 's'));
	System.out.println("String index of o : "+ myString.indexOf('o'));
	
	
		

	}

}
