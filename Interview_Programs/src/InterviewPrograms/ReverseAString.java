package InterviewPrograms;

import java.util.Iterator;

public class ReverseAString {
	
	
	static void usingBuffer() {
		
		String str="HARISH";
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		System.out.println(buffer.reverse());
	}

	static void usingLogic() {
		
		String str="Muni";
		char[] character=str.toCharArray(); //TO STORE EACH CHARACTERS
		String reversed="";
		for(int i=character.length-1;i>=0;i--) {
			reversed=reversed+character[i];
		}
		System.out.println(reversed);
		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usingBuffer();
		usingLogic();
		
	}

}
