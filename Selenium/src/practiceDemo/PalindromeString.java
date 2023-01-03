package practiceDemo;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "Maam";
		int l = s.length();
		String rev ="";
		for(int i=l-1;i>=0;i--) {
			rev = rev + s.charAt(i);
			
		}
		if(s.equals(rev)) {
			System.out.println(s+" is Palindrome String");
		}else {
			System.out.println(s+" is not Palindrome String");
		}
		

	}

}
