package JavaPrograms;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		
		Scanner Sc = new Scanner(System.in);
		
		String s = Sc.nextLine();
		
		int count = 1;
		
		for(int i = 0; i<s.length()-1; i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!= ' ')) {
				
				count++;
			}
			
			System.out.println(count);
		}
				
				

	}

}
