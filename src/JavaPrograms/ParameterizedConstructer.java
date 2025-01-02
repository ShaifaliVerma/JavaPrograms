package JavaPrograms;

public class ParameterizedConstructer {

	
	int x, y;
	double z;
	
	
	
	ParameterizedConstructer(int a, int b, double s){
		
		x = a;
		y = b;
		z = s;
	}
	
	void display() {
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);}


	
	public static void main(String[] args) {
		
		ParameterizedConstructer PC = new ParameterizedConstructer(100, 200, 50.89);
		PC.display();
		
		
	}

}
