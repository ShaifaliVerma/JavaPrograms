package New2024Package;

public class Costructer_2024 {
	
	
	//Default Constructer --Constucter name should be as Class Name.
	int salary;
	String Name;
	
	Costructer_2024()
	{
		
		Name = "SV";
	    salary = 120000;
	}
	
	
	//Parameterized Constructer --
	
	Costructer_2024(String EName, int ESalary)
	{
		
		Name = EName;
		salary = ESalary;
			
	}
	
	
	void display() {
		
		System.out.println(Name);
		System.out.println(salary);
		
	}
	
	public static void main(String args[]) {
		
		Costructer_2024 Cd = new Costructer_2024();
		Cd.display();
		
	}
}
