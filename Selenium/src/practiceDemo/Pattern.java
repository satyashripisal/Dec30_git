package practiceDemo;

public class Pattern {

	public static void main(String[] args) { 
		
		String s = "India";
		int n =s.length();
		System.out.println(n);
		 String str = s.substring(0,1);
		 System.out.println(str);
     	for(int i=0;i<=n;i++) 
     	{
			System.out.println(s.substring(0, i));//(0,i)
			//System.out.println("");
        }
		for(int i=0;i<s.length();i++) {
			System.out.println(s.substring(i, s.length()));//(0,5)=index start with0 and ends with 4
		}
     	
	}

}
