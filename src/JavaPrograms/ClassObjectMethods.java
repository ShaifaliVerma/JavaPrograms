package JavaPrograms;


public class ClassObjectMethods
{
	// Here we are declaring the variables---
	int EmpId;
	String EmpName;
	String Empdesignation;
	int EmpSalary;
	
	void Display() {
		
		// here we create a method in which we will print the data of above variables -
		
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(Empdesignation);
		System.out.println(EmpSalary);
	}
	
	void Show(int EmployeeId, String Name,String Designation,int Salary) {
		
		EmpId = EmployeeId;
		EmpName  = Name;
		Empdesignation = Designation;
		EmpSalary = Salary;
				
	}
	
}