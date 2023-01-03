package Basic_Java;

public class Rectangle {

	private int length;
	private int breadth;
	public int getLength() {
		return length;
		
	}
	public void setLength(int length) {
		this.length = length;
		
	}
	public int getBreadth() {
		return breadth;
		
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
		
	}
	public int calcPerimter(int length, int breadth) {
		System.out.println(length);
		int perimeter = 2*(length+breadth);
		return perimeter;
		
	}
	public static void main(String[] args) {
		Rectangle area = new Rectangle();
		area.setLength(10);
		area.setBreadth(20);
		System.out.println("Length of the rectangle is :"+ area.getLength());
		System.out.println("Breadth of the rectangle is :"+ area.getBreadth());
		
		Rectangle p = new Rectangle();
		System.out.println("The Perimeter of the Rectangle is :"+ p.calcPerimter(area.getLength(), area.getBreadth()));
	}
}
