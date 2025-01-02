package New2024Package;

public class Overloading_Methods2024 {
	
	int x = 10, y = 30;
	
	// When no Parameters Passed -
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, double b) {
		
		System.out.println(a+b);
	}
	
	void sum(double a, int b) {
		
		System.out.println(a+b);
	}
	

	public static void main(String args[]) {
		
		Overloading_Methods2024 cd1 = new Overloading_Methods2024();
		cd1.sum();
		cd1.sum(10.7, 50);
		cd1.sum(10, 70.1);
		cd1.sum(100653, 4567);
	}
}
