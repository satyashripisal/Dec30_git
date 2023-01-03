package JavaProgammes;

public class Prime_No {

	public static void main(String[] args) {
		
		int n = 37;
		int temp = 0;
		for(int i=2;i<=n-1;i++) {
		 if(n%i==0) {
			 temp = temp+1;
		 }
		}
		if(temp==0) {
		System.out.println(n+" is Prime");	
		}
		else {
			System.out.println(n+" is not Prime");
		}
	}

}
