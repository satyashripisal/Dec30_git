package JavaProgammes;

public class Spilt_String {
	
	
	 public static void  spiltString(String Str) {
		StringBuffer special = new StringBuffer(),
		 alpha = new StringBuffer(),
		 num = new StringBuffer();
		for(int i=0;i<Str.length();i++) {
			
			if(Character.isDigit(Str.charAt(i)))
			{
				num.append(Str.charAt(i));
			}
			else if(Character.isAlphabetic(Str.charAt(i)))
			{
			alpha.append(Str.charAt(i));
			}
			else {
				special.append(Str.charAt(i));
		     }
			
		}
		System.out.println(alpha);
		System.out.println(alpha.reverse());
		System.out.println(num);
		System.out.println(num.reverse());
		System.out.println(special);
		System.out.println(special.substring(0, 2));
		
			
		}
		
		

	public static void main(String[] args) {
		String str = "$@TY@$HR!@2209P!$@L";
		spiltString(str);

	}

}
