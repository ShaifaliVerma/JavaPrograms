package JavaPrograms;

public class StaticKeyword {

	// Static keyword used to remove the duplicacy and updation process if we have same variables.
	// Static var and method can used directly.
	// For non static var/method we have to create Object.
	
	
	static int x = 200; //Static Variable
	int y= 600; // Non -static Variable
	
	void m1() {
		
		System.out.println("This is Non static Methods");
	}
	
	static void m2() {
		
		System.out.println("This is static method");
		
	}
	
	public static void main(String[] args) {
	
// This is static method. Here we can call static Variable and method directly without using the Objects.
		
		System.out.println(x); // x is static variable so we can call it here directly
		//System.out.println(y); // this is non static var so we can't call it directly.. for this we have to create a object.
		
		m2(); // m2 is static methods so we can call it here directly
		//m1();
		
		StaticKeyword sk = new StaticKeyword();
		System.out.println(sk.y);
		sk.m1();
		
		
		
	}

}
