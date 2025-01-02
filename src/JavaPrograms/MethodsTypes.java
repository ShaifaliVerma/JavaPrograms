package JavaPrograms;

public class MethodsTypes {

	//No Params no return
	
	void Employee1() {
		
		System.out.println("Hello Shaifali, How r u?");
	}
	
	// No Params but return value --
	
	 String Employee2() {
		return "Hello, How about you?";
		
		}
	 
	 // Params but no return
	 
	 void Employee3(int empid, String name) {
		 
		 System.out.println(empid);
		 System.out.println(name);
	 }
	 
	 //Params and return value
	 
	String Employee4(String name) {
		
		return ("Hello " +name);
	}
	 
}
