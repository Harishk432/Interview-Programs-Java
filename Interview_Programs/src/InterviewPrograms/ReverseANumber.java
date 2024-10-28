package InterviewPrograms;

import java.util.Scanner;

public class ReverseANumber {
	
	static void reverse() {
		
        int givennumber=0;
		
		int reversednumber=0;
		
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		givennumber=sc.nextInt();
				
		while(givennumber!=0) {
		reversednumber=reversednumber*10;
		reversednumber=reversednumber+givennumber%10;
		givennumber=givennumber/10;
		}
		
		System.out.println(reversednumber);
	}
	public static void main(String[] args) {
		reverse();
		}
}