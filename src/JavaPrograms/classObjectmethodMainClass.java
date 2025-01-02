package JavaPrograms;

public class classObjectmethodMainClass {

	public static void main(String[] args) {
	
		ClassObjectMethods com1 = new ClassObjectMethods();
		
		// Approach 1: Through Ref Variable 
		com1.EmpId = 101;
		com1.EmpName = "Shaifali verma";
		com1.Empdesignation = "Sr. Engg";
		com1.EmpSalary = 20000;
		com1.Display();
		
		// Approach 2  -  Through Methods
		
		ClassObjectMethods com2 = new ClassObjectMethods();
		com2.Show(102, "Soni kumari", "Engineer", 15000);
		com2.Display();
	}

}
