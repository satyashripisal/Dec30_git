package JavaProgammes;


import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.next();
		int leng = str.length();
		System.out.println(leng);
		String rev = " ";
		for(int i= leng-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		  if(str.equalsIgnoreCase(rev))
		    {
			System.out.println(rev+" is palindrome String");
		    }
		  else 
		    {
			System.out.println(rev+" is palindrome String");	
		    }
	}

}
