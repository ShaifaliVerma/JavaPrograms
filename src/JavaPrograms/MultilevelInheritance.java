package JavaPrograms;

class P1{
	
	void display(int a) {
		
		System.out.println(a);
	}
}

class Child1 extends P1{
	
	void display2(int b) {
		
		System.out.println(b);
	}
}

class child2 extends Child1{
	
	void display3(int c) {
		
		System.out.println(c);
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.display(300);
		c1.display2(879);
		
		
		child2 c2 = new child2();
		c2.display(700);
		c2.display2(688);
		c2.display3(46587);
	}

}
