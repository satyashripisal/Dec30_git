package practiceDemo;

public class Star_Pattern {

	public static void main(String[] args) {
		int row=4;
		//Outer loop for Rows
		for(int i=0;i<row;i++) 
		{
			//Inner loop for column
			for(int j=0;j<=i;j++)
			{
				//Print Star
				System.out.print("* ");
			}
			//throw the cursor in the new line after printing each line
			System.out.println();
		}

		}
		
}
/*  
  * 
  * *
  * * *
  * * * *
 */
