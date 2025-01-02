package New2024Package;

public class FibonacciSeriesProgram_2024 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i<=10; i++) {
			
		int Sum = n1+n2;
		
		System.out.println(Sum);
		
		n1 = n2;
		
		n2 = Sum;
		
		}

	}

}
