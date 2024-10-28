package InterviewPrograms;

import java.util.Scanner;

public class FindPositionofALPHABETS {
	
	public static void main(String[] args) {
		
		
		//ASCIII   a-97;    A-65
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Character");
		char givenchar=scanner.next().charAt(0);
		
		givenchar=Character.toLowerCase(givenchar);
		
		int asciivalue=(int)givenchar;
		System.out.println(asciivalue);
	
		int position=asciivalue-96;
		System.out.println(position);
	}

}
