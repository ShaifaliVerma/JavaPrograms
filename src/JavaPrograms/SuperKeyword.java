package JavaPrograms;

// Super keyword is used to invoke the parent class Variable and methods using Child Class Objects.

class superClass{
	
	int a = 10;
	
	void sMethod1(int a, int b) {
		
		System.out.println(a+b);
	}
}


class superChild extends superClass {
	
	int a = 800;
	
	void display() {
		
		System.out.println(super.a);
	}
	
	void sMethod1(int a, int b) {
		
		System.out.println(a*b);
		super.sMethod1( a, b);
	}
	

}
public class SuperKeyword {

	public static void main(String[] args) {

		superChild sp = new superChild();
		sp.sMethod1(4, 9);
		sp.display();
		
		// if we want to invoke the parent class value then we use Super Keyword 
		
		
	}

}
