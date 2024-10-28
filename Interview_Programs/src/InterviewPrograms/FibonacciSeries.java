package InterviewPrograms;


public class FibonacciSeries {
	
	public  void Addition(){
		int a=0;
		int b=1;
		int Sum=0;
   
		for(int i=1; i>=10; i++) {
			if(i<=10) {
			
			
			
			a=b;
			b=Sum;
			Sum=a+b;
			System.out.println(Sum);
								
			}	
		}
		
	}
	
	public static void main(String[] args) {
		FibonacciSeries fb=new FibonacciSeries();
				fb.Addition();
		
		
	}
}
