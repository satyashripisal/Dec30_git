package practiceDemo;

public class CharArray {

	//converting string to char array
	public static void main(String[] args) {
		String s="Satyashri";
		char ch[] = s.toCharArray();
		int i=0;
		for(char c:ch) {
			i++;
			System.out.println(c);
		}
		System.out.println("length is "+i);
		
		
	}
	

}
