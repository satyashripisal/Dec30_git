package selenium_programing;

public class ReverseWordSequence2 {

	public static void main(String[] args) {
		String s = "You shall pass";
		String a[] = s.split(" ");
		String ans = " ";
		for(int i= a.length-1;i>=0;i--){
			ans += a[i] + " ";
		}
		System.out.println("ReverseWordSeq: "+ ans);
		

	}

}
