package JavaPrograms;

public class ReverseStringProgram_2024 {
	
	public static void main(String args[]) {
		
		String sr = "Tanishq";
		//String rev = " ";
		
		/*
		for(int i = (sr.length()-1); i>=0; i--) {
			
			rev = rev+sr.charAt(i);
		}
		
		System.out.println("Reverse String: "+rev);
		
		*/
		
		StringBuffer SB = new StringBuffer(sr);
		System.out.println(SB.reverse());
		
		
	}

}
