package JavaProgammes;

public class Fibonnaci_series {

	public static void main(String[] args) {
		int n = 6;
		int a=1, b=1, c;
		for(int i=0;i<=n-1;i++) {
			
			c = a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
