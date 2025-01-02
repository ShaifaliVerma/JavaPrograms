package New2024Package;

public class String_2024 {

	public static void main(String args[]) {
		/*
		// Length function on Strings --
		String s = "Shaifali";
		System.out.println(s.length());
		
		
		//Trim function on strings = 
		
		String s1 = "  Shaifali Verma   ";
		//before trim method - 
		System.out.println(s1.length());
		
		
		//After trim methods - length of string var - 
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		
		// Concatenation - 
		
		String s21 = "Shaifali Verma";
		String s3 = "Avi Verma";
		String s32 = "tanishq soni";
		//System.out.println(s21+s3);
		System.out.println(s21.concat(s3).concat(s32));
		
		
		//CharAt() - its return the single character 
		String Q1 = "Parikshit Verma";
		System.out.println(Q1.charAt(5));
		
		
		// Contains Methods - It return TrUE/False
		
		System.out.println(Q1.contains("Parik"));
		
		
		//Equal & EqualgnoreCase --
		
		String q1 = "Shaifali";
		String q2 = "shaifali";
		System.out.println(q1.equals(q2)); // its compare the value. One s is in Caps and other one is in Small.
		System.out.println(q1.equalsIgnoreCase(q2));
		
		
		//Lower & UpperCase --
		
		String q1 = "shaifali";
		String q2 = "Parikshit";
		
		System.out.println(q1.toUpperCase());
		System.out.println(q2.toLowerCase()); */
		
		
		// == & Equal  - Return True or False
		
		String s1 = "shaifali verma";
		String s2 = "shaifali verma";
		
		System.out.println(s1==s2); //
		System.out.println(s1.equals(s2));
		
		String q1 = new String("Shaifali Verma");
		String q2  = new String("Shaifali Verma");
		String q3 = q2;
		System.out.println(q1==q2); // == Sign compare the two Objects
		System.out.println(q1.equals(q2)); // Equal Keyword compare the content of Objects.
		
		System.out.println(q1==q3);
		System.out.println(q2==q3);
		System.out.println(q1.equals(q3));
				
	}
	
	
}
