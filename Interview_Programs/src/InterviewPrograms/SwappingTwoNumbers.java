package InterviewPrograms;

public class SwappingTwoNumbers {

	public void UsingThirdVariable() {
		// TODO Auto-generated method stub
	int mySalary=25;
	int TeamLeader=50;
	
	
	System.out.println("Before Swapping My salary "+mySalary+" Before swapping TeamLeader salary  "+TeamLeader);
	
	int temp=mySalary;
	mySalary=TeamLeader;
	TeamLeader=temp;
	System.out.println("After Swapping My salary "+mySalary+" After swapping TeamLeader salary  "+TeamLeader);
	System.out.println("---------------------------------------------------------------");
	}
	
	
	public void WithoutThirdVariable() {
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping A value "+a+" Before swapping B value  "+b);
		
		
		a=a-b; 
		b=a+b; 
		a=b-a;
		
		System.out.println("After Swapping A value "+a+" After swapping B value  "+b);
		
		
	}
	
	public static void main(String[] args) {
		SwappingTwoNumbers st = new SwappingTwoNumbers();
		st.UsingThirdVariable();
		st.WithoutThirdVariable();
		
	}

}
