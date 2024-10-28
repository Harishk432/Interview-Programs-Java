package InterviewPrograms;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Harish";
		char toFind='h';
		int occurence=0;
		
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)==toFind) {
				occurence=occurence+1;
			}
		}
		System.out.println(toFind+"  is present "+occurence+" number of times");
	}

}
