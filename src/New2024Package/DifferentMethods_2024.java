package New2024Package;

public class DifferentMethods_2024 {

	int ID;
	String Name;
	int Salary;
	
	
	//1. No Params, no Return value
	
	void display() {
		
		System.out.println(ID);
		System.out.println(Name);
		System.out.println(Salary);
		
	}
	
	// 2. Taking Params but no return value - 
	
	void display1(String Name) 
	
	{
		
		System.out.println("Hello " +Name);
	}
	
	// 3. No Parms but return Value - 
	
	String display3(){
		
		return Name;
	}
	
	//Parms with Return Value - 
	
	String display4(int id){
		
		return "Hello your emp id: "+id;
	}
	
	public static void main(String[] args) {
		
		DifferentMethods_2024 DM = new DifferentMethods_2024();
		DM.ID = 101;
		//DM.Name = "Rahul Verma";
		//DM.Salary = 45000;
		
		//DM.display();
		//DM.display1("Shaifali Verma");
		
		
		//String var1 = DM.display3();
		//System.out.println(var1);
		
		String var2 = DM.display4(1021);
		System.out.println(var2);

	}

}
