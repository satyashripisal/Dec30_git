package JavaProgammes;

public class ExactMultipleOf_3and5 {
	
	public static void multipleOf3And5(int n){
		int a = 3;
		int b = 5;
		for(int i=1;i<=n;i++) {
			String s ="";
			if(i==a) {
				a = a+3;
				s = s+"Hello ";
			}
			if(i==b) {
				b = b+5;
				s = s + "World";
			}
			if(s=="") {
				System.out.println(i);
			}else {
				System.out.println(s);
			}
		}
		
	}

	public static void main(String[] args) {
		multipleOf3And5(45);
	}

}
