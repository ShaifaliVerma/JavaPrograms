package JavaPrograms;

class qwerty1{
	
	void method1(int a) {
		
		System.out.println(a);
	}
	
	void qwe2(int b) {
		
		System.out.println(b);
	}
}

class sukoon extends qwerty1{
	
	void method1(int a) {     // OverRiding
		
		System.out.println(a*a);
	}
	
	void qwe2(int a, int b) {         //OverLoading
		
		System.out.println(a+b);
	}
}


public class OverLoadingVSOverRiding {

	public static void main(String[] args) {
	
		sukoon sk = new sukoon();
		sk.method1(8);
		sk.qwe2(6);
		sk.qwe2(67, 45);
	}

}
