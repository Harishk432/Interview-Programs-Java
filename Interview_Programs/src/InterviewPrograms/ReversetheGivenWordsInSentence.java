package InterviewPrograms;

public class ReversetheGivenWordsInSentence {

	public void reverse() {
		
		String given="Harish Loves Someone";
		String reversed="";
		String[] temp=given.split(" "); //to remove spaces
		System.out.println(temp.length);
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		
		System.out.println("----------------------------------------");
		
		for(int i=temp.length-1;i>=0; i--) {
			reversed=reversed+temp[i]+" ";
			
		}
		System.out.println(reversed);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversetheGivenWordsInSentence rev=new ReversetheGivenWordsInSentence();
		rev.reverse();
	}

}
