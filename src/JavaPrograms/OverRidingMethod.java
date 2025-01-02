package JavaPrograms;


class SV{
	
	void display1(int a) {
		
		System.out.println(a);
	}
	
	void display2(int b) {
		
		System.out.println(b);
	}
}

class SVA extends SV{
	
	void display1(int a) {
		
		System.out.println(a*a);
	}
	
	
	void display2(int b) {
		
		System.out.println(b*b);
		
	}
}


public class OverRidingMethod {

	public static void main(String[] args) {

		SVA Bobj = new SVA();
		Bobj.display1(4);
		Bobj.display2(3);
		
		SV Obj1 = new SV();
		Obj1.display1(4);
		Obj1.display2(6);
	}

}
