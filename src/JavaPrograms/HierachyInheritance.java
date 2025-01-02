package JavaPrograms;


class A{
	
	void show1(int a) {
		
		System.out.println(a);
	}
}


class B extends A{
	
	void show2(int b) {
		
		System.out.println(b);
	}
}

class C extends A{
	
	void show3(int c) {
		
		System.out.println(c);
	}
}


public class HierachyInheritance {

	public static void main(String[] args) {

		C cObject = new C();
		cObject.show3(6466);
		cObject.show1(24372);
		
		B bObject = new B();
		bObject.show2(4325276);
		bObject.show1(23456);
	}

}
