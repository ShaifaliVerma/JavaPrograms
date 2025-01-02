package JavaPrograms;

public class ThisKeyword {

	//This keywords is used to differentiate the Class Variable.
	// If class and local variable both are same then through this keyword we can differentiate the Class var.
	
	int x, y; // Class Variable
	 
	void setdata(int x, int y) {
		
	//Class and local variable both are same then we used THIS keyword to differentiate it,
		this.x = x;
		this.y = y;
	}
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword();
		th.setdata(200, 500);
		th.display();
	}

}
