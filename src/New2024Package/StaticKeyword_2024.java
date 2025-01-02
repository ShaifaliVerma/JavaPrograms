	package New2024Package;

public class StaticKeyword_2024 {
	
	static int Empid;
	static String EmpName;
	float empsalary;
	
	StaticKeyword_2024(int empid, String empname, float Salary) {
		
		Empid = empid;
		EmpName = empname;
		empsalary = Salary;
	}
	
	static void display() {
		
		System.out.println(Empid);
		System.out.println(EmpName);
	}
	
	void display2() {
		
		System.out.println(empsalary);
	}

	public static void main(String args[]) {
		
		StaticKeyword_2024 sk = new StaticKeyword_2024(4256342, "Shaifali Verma", 9999999);
		System.out.println(Empid);
		System.out.println(EmpName);
		
		display();
		
		//Non Static Variable & Methods --
		sk.display2();
		System.out.println(sk.empsalary);
	}
}
