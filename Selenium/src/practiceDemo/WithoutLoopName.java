package practiceDemo;

public class WithoutLoopName {

	public static void main(String[] args) {
		String s1 = "Satyashri\n";
		String s2 =s1+s1;
		String s5 = s2+s2+s1;
		String s10 = s5+s5;
		String s25 = s10+s10+s5;
		String s50 = s25+s25;
		System.out.println(s50);
		System.out.println(s50.length()); 
		
//        String s3 = s1 + s1 + s1;
//        String s10 = s3 + s3 + s3 + s1;
//        String s30 = s10 + s10 + s10;
//        String s100 = s30 + s30 + s30 + s10;
//        System.out.print(s100);
    	
       

	}

}
