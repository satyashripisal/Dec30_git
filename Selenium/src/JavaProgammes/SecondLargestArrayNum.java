package JavaProgammes;

import java.util.Arrays;

public class SecondLargestArrayNum {

	public static void main(String[] args) {
		int array[] = {1,6,5,13,11,7};
	    Arrays.sort(array);
	    System.out.println("Second Largest Number in Array"+" "+ array[array.length-2]);
	}

}
