package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumberInAnArray {
	
	Integer givennumber[]= {2,3,5,8,1};
	
	
	public void usingArray() {
		
	Arrays.sort(givennumber);
	System.out.println(givennumber[0]);
		
	}
	
	public void usingCollections() {
		
		List <Integer> list =Arrays.asList(givennumber);
		Collections.sort(list);
		int smallest = list.get(0);
		System.out.println(smallest);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSmallestNumberInAnArray small=new FindSmallestNumberInAnArray();
		small.usingArray();
		small.usingCollections();
	}

}
