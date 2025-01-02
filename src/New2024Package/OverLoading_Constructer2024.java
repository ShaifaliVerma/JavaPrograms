package New2024Package;

public class OverLoading_Constructer2024 {
	
              int x,y;
              double z;
	
	OverLoading_Constructer2024(){
		
		x = 100;
		y = 200;
	}
	
	OverLoading_Constructer2024(int a, int b){
		
		x = a;
		y = b;
	}
	
	OverLoading_Constructer2024(int a, double d){
		
		x = a;
		z = d;
		
	}
	
	OverLoading_Constructer2024(double a, int b)
	{
		z= a;
		y = b;
	}
		
	void display() {
		
		System.out.println(x+y);
		System.out.println(x+z);
		System.out.println(z+y);
	}
	
	public static void main(String args[]) {
		
		OverLoading_Constructer2024 OD = new OverLoading_Constructer2024(200.3,500);
		
		OD.display();
		
	}
}

