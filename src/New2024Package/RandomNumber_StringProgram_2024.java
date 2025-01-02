package New2024Package;

import java.util.Random;

public class RandomNumber_StringProgram_2024 {

	public static void main(String[] args) {
	
		Random RandNum = new Random();
		
		int RandomInt = RandNum.nextInt(30);
		
		System.out.println(RandomInt);
		
		
		double RandomD = RandNum.nextDouble(50);
		
		System.out.println(RandomD);
	}

}
