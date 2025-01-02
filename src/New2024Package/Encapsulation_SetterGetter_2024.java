package New2024Package;

import com.beust.jcommander.Strings;

public class Encapsulation_SetterGetter_2024 {
	
	//Encapsulation used to protect the variable by changing their value or by direct access the variable..
	
	private int Stuid;
	private String StuName;
	private float StuMarks;
	
	
	public void set_Stuid(int Stuid) {
		
		this.Stuid = Stuid;
	}


	public int getStuid() {
		return Stuid;
	}


	public void setStuid(int stuid) {
		Stuid = stuid;
	}


	public String getStuName() {
		return StuName;
	}


	public void setStuName(String stuName) {
		StuName = stuName;
	}


	public float getStuMarks() {
		return StuMarks;
	}


	public void setStuMarks(float stuMarks) {
		StuMarks = stuMarks;
	}
	


public static void main(Strings args[]) {
		
	Encapsulation_SetterGetter_2024 SG_Object = new Encapsulation_SetterGetter_2024();
	
	SG_Object.setStuid(65232);
	System.out.println(SG_Object.getStuid());
	
	SG_Object.setStuName("Shaifaliv");
	System.out.println(SG_Object.getStuName());
	
	SG_Object.setStuMarks(80);
	System.out.println(SG_Object.getStuMarks());
	
	
	}
}


