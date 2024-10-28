package InterviewPrograms;

public class FindTheElementPresentInArray {
	
	int array[]= {1,2,3,4,5,6,6};
	
	int numbertoFind=7;
	
	boolean found=false;
	
	public void PresentOrNot() {
		for(int number:array) {
			if(number==numbertoFind) {
				found=true;
				break;
				
			}
		}
		if(found) {
			System.out.println("Number Found");
			
		}else{
				System.out.println("Number NOT Found");
			}
			
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTheElementPresentInArray numberfind=new FindTheElementPresentInArray();
		numberfind.PresentOrNot();
	}

}
