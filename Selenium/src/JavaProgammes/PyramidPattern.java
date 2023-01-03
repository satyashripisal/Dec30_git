package JavaProgammes;

public class PyramidPattern {

	public static void main(String[] args) {
		String name = "Satyashri";
		String s = "";
		for(int i=name.length()-1;i>=0;i--) {
			s=s+name.charAt(i);
			System.out.println(s);
		}
	}

}
