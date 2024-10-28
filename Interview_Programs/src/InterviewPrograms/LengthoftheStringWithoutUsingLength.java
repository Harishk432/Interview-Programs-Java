package InterviewPrograms;

public class LengthoftheStringWithoutUsingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String givenstring="HARISH";
		System.out.println(givenstring.length());
		
		char[] character=givenstring.toCharArray();// TO STORE AS EACH CHARACTERS
		int length=0;
		for(char c:character) {
			length++;
		}
        System.out.println(length);
	}

}
