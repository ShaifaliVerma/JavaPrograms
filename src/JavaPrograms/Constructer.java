package JavaPrograms;

public class Constructer {
	
	// Constructer name should be same as Class name--
	
	int x, y;
	double z ;
	
	
	// Default Constructer --
	
	Constructer(){
		// Constructer used only for assigning the value to variable. No logic implemented here.
		x = 10;
		y = 20;
		z = 40;
		
	}
	
	void display() {
		
		System.out.println(x+y);
		System.out.println(z);
	}
	
	public static void main(String args[]) {
		
		Constructer  cd = new Constructer(); // Constructer invoked only creation of Object only.
		cd.display();
	}
}
