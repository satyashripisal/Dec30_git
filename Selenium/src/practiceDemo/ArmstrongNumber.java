package practiceDemo;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no = 153;
		int remainder;
		int sum=0;
	for(int i=no;i>0;i=i/10) {
		remainder = i%10;
		sum=sum +remainder*remainder*remainder;
	}
		if(sum==no) {
			System.out.println(no+" is Armstrong number");
		}
		else {
			System.out.println(no+" is not Armstrong number");
		}
	
		
	}

}
