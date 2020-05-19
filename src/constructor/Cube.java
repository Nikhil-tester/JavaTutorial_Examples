package constructor;

public class Cube {
	
	int length;
	int bredth;
	int height;
	
	public int getCubeVolume() {
		return (length * bredth * height);
	}
	
	Cube(){
		length = 10;
		bredth = 20;
		height = 30;
	}
	//constructor over loading : two constructor provide at same time, one without argument and other with argument 
	
	Cube(int l, int b, int h){
		length = l;
		bredth = b;
		height = h;
		
	}

}
