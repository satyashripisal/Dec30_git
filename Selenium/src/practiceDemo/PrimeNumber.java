package practiceDemo;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=5,b=0;
		if(a>1) {
			for(int i=2;i<a;i++) {
				if(a%i==0) {//1 2 1
					b=1;
				}
				if(b==1) {
					System.out.println("It is Prime no.");
				}else {
					System.out.println("It is not  Prime no.");
				}
				break;
			}
		}
		else {
			System.out.println("Invalid no.");
		}
	}

					
}
