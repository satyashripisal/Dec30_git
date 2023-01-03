package JavaProgammes;

public class Reverse_String {

 public static void main(String[] args) {
		String str = "you shall not pass";	
	 String s[] = str.split(" "); 
	 String ans = ""; 
     for (int i = s.length - 1; i >= 0; i--) { 
		      ans += s[i] + " "; 
		      } 
		      System.out.println("Reversed String: " + ans); 
		    }
		

}
	
