package New2024Package;

public class SwapNumbers_2024 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+" "+b);
		
		/*
		// Using the Third Variable ----
		
		int T = a; //T = 10
		a = b;  //a  = 20
		b = T;
		
		System.out.println(a+" "+b); */
		
	
		// Without Using the 3rd Variable ---
		
		a = a+b;   // 10+20 = 30, a = 30
		b = a-b;   //30-20 = 10;
		a = a-b; // 30-10=20
				
				
		System.out.println(a+" "+b);
		

	}

}
