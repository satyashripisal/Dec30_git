package JavaProgammes;

public class PalindromeNo {

	public static void main(String[] args) {
		int no = 121;
		int temp = no;
		int rev = 0;
		int rem;
		for(int i=no;i>=0;i=i/10) {
			rem = temp%10;
			rev = rev*10+rem;
			
		}
		if(no==rev) {
			System.out.println(no + "palindrome");
		}
		else {
			System.out.println(no+" not palindrome");
		}
	}

}
