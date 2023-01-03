package practiceDemo;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c = new Child();
		c.setAccNo(63210004);
		c.setName("satyashri");
		System.out.println("AccNo "+c.getAccNo() +"\nName "+c.getName());

	}

}
