package JavaPrograms;

public class OverloadingMethod {

	
	// Overloading means -  we used methods of same name but purposes are different.
	
	// 1. Methods name should be same.
	// 2. Parameter should be different.
	//3. Data types should be different.
	//4. Orders of data type should be different.
	
	int x, y;
	double z;
	
	
	void sum() {
		
		x = 10;
		y = 20;
		
		
	}
	
	void sum(int a, int b) {
		
		x = a;
		y = b;
	}
	
	void sum(int a, double s) {
		
	x = a;
	z = s;
	}
	
	
	void sum(double s, int a) {
		
		z = s;
		x = a;
	}
	
	void display() {
		
		System.out.println(x+y);
		System.out.println(x+z);
		System.out.println(z+x);
		
		
	}
	public static void main(String[] args) {
		
		OverloadingMethod OM = new OverloadingMethod();
		//OM.sum();
		//OM.sum(100, 300);
		//OM.sum(100, 50.98);
		OM.sum(40.33, 50);
		
		OM.display();

	}

}
