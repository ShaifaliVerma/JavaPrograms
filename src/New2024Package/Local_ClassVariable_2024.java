package New2024Package;

public class Local_ClassVariable_2024 {

	int StuID;
	String StuName;
	String StuDept;
	
	//First method to print the data of all variable - 
	
	void print() {
		
		System.out.println(StuID+" "+StuName+" "+StuDept);
	}


	// One more method for using class and local var together 
	
	void Display(String NAME, int ID, String deptname) {
		
		//Here assigning the value of Local var to Class Var.
		// LOcal Var used only inside the same method.Class var we can use anywhere.
		StuName = NAME;
		StuID = ID;
		StuDept = deptname;
		
		}

	public static void main(String[] args) {
		
		Local_ClassVariable_2024 LC = new Local_ClassVariable_2024();
		LC.Display("Vikash kumar",897, "TL");
		LC.print();
	
		
}}
