package Map;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		/* Hashmap is a class implements Map Interface
		 * Extends AbstractMap
		 * it contains only unique elements
		 * stores the value - key - value pair
		 * it may have one null key and multiple null values 
		 * it maintains no order
		 * hashmap is non-synchronised --- Not Thread Safe
		 * concurrent modification exception -- Fail -- fast condition */
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Ruby");
		hm.put(4, "Python");
		System.out.println(hm);
	}
}
