package New2024Package;

public class ClassObject_2024 {
	
	String Ename;
	int Esalary;
	int Eid;
	
	void display() {
		
		System.out.println(Ename);
		System.out.println(Esalary);
		System.out.println(Eid);
		
	}
	
	public static void main(String args[]) {
		
		ClassObject_2024 Cobj1 = new ClassObject_2024();
		
		Cobj1.Ename = "Shaifali Verma";
		Cobj1.Esalary = 54875877;
		Cobj1.Eid = 55;
		
		Cobj1.display();
	}

}
