package JavaProgammes;

public class Reverse_String_demo {

	public static void main(String[] args) {
		String s = "My Name Is Satyashri";
		String a[] = s.split("");
		int l = s.length();
		String rev = "";
		for(int i=l-1;i>=0;i--) {
			rev = rev+a[i]+ "";
			
		}
		System.out.println("reverse word= "+rev);
		

	}

}
