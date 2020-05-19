package accessmodifiers;
import binding.*;

//write only

class Text113{
	private String collegeName;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}


public class Ex113 {

	public static void main(String[] args) {
		Text113 obj113=new Text113();
		
		obj113.setCollegeName("RCET College of Technology");
		
		
		

	}

}
