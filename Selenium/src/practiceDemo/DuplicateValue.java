package practiceDemo;

public class DuplicateValue {

	public static void main(String[] args) {
		String a[]  = {"Java","Perl","Python","Php","Java"};
		char a1[] = {'b','c','d','b','e','c'};
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate value is "+a[i]);
				}
					
				}
				else {
					System.out.println();
				}
			}
			
		}*/
          for(char str:a1) {
        	  System.out.println(str);
          }
	}

}
