package New2024Package;

// Super keyword work on Inheritance concept and used to invoke the Parent class var and method using child class Object..

class SuperParent{
	
	int a = 10;
	
	void dis() {
		
		System.out.println(a);
	}
	
	void dis2() {
		
		System.out.println("I am Parent class");
	}
}

class SuperChild extends SuperParent {
	
	
	int b = 20;
	
	void dis() {
		
		//System.out.println(b);
		super.dis();
	}
	
	void dis2() {
		
		//System.out.println("I am Child class");
		super.dis2(); //Through Superkeyword we are calling the Parents class Methods.
	}
}

public class SuperKeyword_2024 {
	
	public static void main(String args[]) {
		
		SuperChild SC =  new SuperChild();
		SC.dis2();
		
		SC.dis();
		
		
	}

}
