package InterviewPrograms;

public class RemoveLEADINGandTRAILINGSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input=" Hi harish  ";
		System.out.println(input.trim());
		
		System.out.println(input.replaceAll("^[ /t]+|[ /t]+$", ""));
		System.out.println(input.replaceAll("^[ /t]", ""));
        System.out.println(input.replaceAll("[ /t]+$", ""));
        
        System.out.println(input.strip());
        System.out.println(input.stripLeading());
        System.out.println(input.stripTrailing());
		
	}

}
