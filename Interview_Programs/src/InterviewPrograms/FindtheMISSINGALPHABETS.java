package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class FindtheMISSINGALPHABETS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given ="a, b,  c";
		given=given.toLowerCase();
		given=given.replaceAll(" ", "");
		
		String[]userarray=given.split("");
		String[] alphabets="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1=new HashSet<String>(Arrays.asList(userarray));
		HashSet<String> set2= new HashSet<String>(Arrays.asList(alphabets));
		
		set2.removeAll(set1);
		System.out.println(set2);
	}

}
