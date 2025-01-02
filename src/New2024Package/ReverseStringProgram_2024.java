package New2024Package;

public class ReverseStringProgram_2024 {

	public static void main(String[] args) {
		
		
		String S = "Shaifali";
		String Rev = " ";
		
		for (int i = S.length()-1; i>=0; i--)
		
		{
			
			Rev = Rev + S.charAt(i);
		}
		
		System.out.println(Rev);
	
	}
	
		
	

}
