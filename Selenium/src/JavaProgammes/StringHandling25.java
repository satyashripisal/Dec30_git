package JavaProgammes;

public class StringHandling25 {

	public static void main(String[] args) {
		String str = "selenium";
		String str1 = "SELENIUM";
		String str2 = "Selenium";
		String str3 = "SELENIUM";
		String str4 = "  Testing";
		
		System.out.println(str.compareTo(str3));
		System.out.println(str1.compareTo(str));
		System.out.println(str1.compareTo(str3));
		System.out.println();
		
		System.out.println(str==str1);
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println();
		
		System.out.println(str.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println();
		
		System.out.println(str.charAt(0));
		System.out.println(str1.concat(str));
		System.out.println(str4.trim());
		System.out.println(str.indexOf(str4));

	}

}
