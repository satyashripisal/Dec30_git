package Demo_JavaProgram;

public class Vowel_Consonent_Seperate {

	public static void main(String[] args) {
		
		String str = "How to do in java";
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println(str.length());
		
	    int vCount = 0, cCount = 0;  
	    //3
	    for (int i = 0; i < str.length(); i++) 
	    {
	      //4. Checks whether a character is a vowel
	      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                               || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	        // Increments the vowel counter
	        vCount++;
	      }
	      //5. Checks whether a character is a consonant
	      else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
	      {
	        // Increments the consonant counter
	        cCount++;
	      }
	    }
	    //6
	    System.out.println("Number of vowels: " + vCount);
	    System.out.println("Number of consonants: " + cCount);

	}

}
