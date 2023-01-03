package practiceDemo;

public class LeapYear {

	public static void main(String[] args) {
		int yr = 2028;
		if(yr%4==0 && yr%100!=0||yr%400==0) {
			System.out.println("leap yr");
		}
		else {
			System.out.println("not leap yr");
		}

	}

}
