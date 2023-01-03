package JavaProgammes;

import java.util.Scanner;

public class Factorial_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int num = n;
		
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
			
		}
		System.out.println(fact);

	}

}
