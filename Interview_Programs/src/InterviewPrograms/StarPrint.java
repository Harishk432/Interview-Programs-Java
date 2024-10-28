package InterviewPrograms;

import java.util.Scanner;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		
		int numberOfLines=sc.nextInt();
		
		int row,column=0;
		for(row=0;row<=numberOfLines;row++) {	
		for(column=0;column<=row;column++) {
			System.out.print("*");
			
			
		}
		System.out.println();
		}
		
	}

}
