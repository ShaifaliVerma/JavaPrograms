package New2024Package;

//Overriding concept work on inheritance concept.
/*
class Mahakal{
	
	int a;
	
	void jai(int a) {
		
		System.out.println(a);
	}
}

class Shaifali extends Mahakal{
	
 
	void jai(int a) {
		
		System.out.println(a*a); // Here we change the body of method but the definition is same.
	}
}
*/


class ParentSum{
	
	int a;
	int b;
	
	void summarization(int a, int b) {
		
		System.out.println(a+b);
	}
}

class ChildSum extends ParentSum{
	
 void summarization(int a, int b) {
		
		System.out.println(a*b);
	} 
}

public class OverRiding_2024 {

	public static void main(String[] args) {
	
		// Creating object of sub clss - 
		/*
		Shaifali sh = new Shaifali();
		sh.jai(9);

		Mahakal Mk = new Mahakal();
		Mk.jai(3); */
		
// Creating Objects of another Example - 
		
		ChildSum CS =  new ChildSum();
		CS.summarization(2,8);
		
		ParentSum PS = new ParentSum();
		PS.summarization(2, 9);
		
	}

	
}
