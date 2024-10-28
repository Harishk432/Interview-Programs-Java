package InterviewPrograms;

public class VowelsOfGivenSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Harish love";
		int vowelscount=0;
		given=given.toLowerCase();
		
		int length=given.length();
		for(int i=0; i<length;i++) {  
			if(given.charAt(i)=='a' || given.charAt(i)=='e'  || given.charAt(i)=='i'  || given.charAt(i)=='o' || given.charAt(i)=='u') {
				vowelscount++;
				
			}
			
		}
		System.out.println("Your name contains "+vowelscount+"  Vowels");

	}

}
