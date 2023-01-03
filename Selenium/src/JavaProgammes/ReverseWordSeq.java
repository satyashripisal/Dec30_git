package JavaProgammes;

public class ReverseWordSeq {

	public static void main(String[] args) {
		
		String input = "Designed and Developed";
		String str [] = input.split(" ");
		System.out.println(str.length);
		StringBuilder output = new StringBuilder();
		
		for(int i=str.length-1;i>=0;i--) {
			//output.append(str[i]);
			//output.append(" ");
			output.append(str[i]+" ");
			
		}
		System.out.println("RverseWordSeq: " + output);
	}

}
