package New2024Package;

class QwertyParent
{
	
	int a;
	
	void display1(int a) {
		
		System.out.println(a);
	}
	
}


class child1 extends QwertyParent{
	
	int b;
	
	void display2(int b) {
		
		System.out.println(b);
	}
}


class child2 extends QwertyParent{
	
	int c;
	
	void display3(int c) {
		
		System.out.println(c);
	}
}


public class HierachyLevel_Inheritance_2024 {

	public static void main(String args[]) {
		
		//Creation of Objects - 
		
		child2 c2 = new child2();
		c2.display3(90000);
		c2.display1(50000);
		
		child1 c1 = new child1();
		c1.display1(51111);
		c1.display2(66660);
	}
}
