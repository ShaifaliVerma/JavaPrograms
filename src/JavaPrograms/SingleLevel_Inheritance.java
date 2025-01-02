package JavaPrograms;

class Parent 
{
	
	void display(int a) {
		
		System.out.println(a);
	}
}

class Child extends Parent {
	
	void show(int b) {
		
		System.out.println(b);
		
	}
	
}








public class SingleLevel_Inheritance {

	
	public static void main(String[] args) {
		
		
		Child c1 = new Child();
		c1.display(100);
		c1.show(500);
	}

}
