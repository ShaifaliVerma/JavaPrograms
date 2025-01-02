package JavaPrograms;

public class ConstructerOverloading {

	int x, y;
	double z;
	
	ConstructerOverloading(){
		
		x = 10;
		y = 60;
	}
	
	ConstructerOverloading(int a, int b){
		
		x = a;;
		y = b;
	}
	
	ConstructerOverloading(int a, double s){
		
		x = a;
		z = s;
	}
	
	ConstructerOverloading(double s, int a){
		z = s;
		x = a;
		
	}
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
	
	public static void main(String[] args) {
	

		ConstructerOverloading CO = new ConstructerOverloading(20.88,50);
		CO.display();
	}

}
