package New2024Package;

//Multilevel inheritance-- 

class grandparents{
	
	int a;
	
	void gp(int a) {
		
		System.out.println(a);
	}
}

class Parents extends grandparents{
	
	int b;
	
	void ps(int b) {
		
	System.out.println(b);
	
	}
}

class child extends Parents{
	
	int c;
	
	void cs(int c) {
		
	System.out.println(c);
	}
}

public class MultiLevel_Inheritance_2024 {


public static void main(String args[]) {
	

	Parents Pobj1 = new Parents(); // Creating object of Parents class - 
	child Cobj = new child();
	
	
	
	Pobj1.b = 2000;
	Pobj1.ps(23433);
	Pobj1.gp(3000);
	
	Cobj.cs(876533);
	Cobj.ps(99999);
	Cobj.gp(888800);
	
}}
