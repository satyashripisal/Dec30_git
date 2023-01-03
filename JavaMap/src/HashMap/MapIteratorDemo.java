package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> fruitmap = new HashMap<>();
		fruitmap.put(1, "Mango");
		fruitmap.put(2, "Orange");
		fruitmap.put(3, "Banana");
		fruitmap.put(4, "Apple");
		//keySetIteration(fruitmap);//by using keyset
		//iteratorMap(fruitmap);//by using Iterator
		//entrySetMap(fruitmap);//by using entryset
		//streams(fruitmap);//by using streams java8
		foreachLoop(fruitmap);//by using foreach method java8
	}

	private static void foreachLoop(Map<Integer, String> fruitmap) {
		fruitmap.forEach((key, value)->
		{
			System.out.println("Key :"+key);
			System.out.println("Value :"+value);
		});
		
	}

	private static void streams(Map<Integer, String> fruitmap) {
		fruitmap.entrySet().stream().forEach(e->
		System.out.println("Key Value : "+e.getKey() +" "+"Value : "+ e.getValue())
				);
		
	}

	private static void entrySetMap(Map<Integer, String> fruitmap) {
		for (Map.Entry<Integer, String> entry : fruitmap.entrySet()) {
			System.out.println("Key Value ="+entry.getKey());
			System.out.println("Value ="+entry.getValue());
		}
		
	}

	private static void iteratorMap(Map<Integer, String> fruitmap) {
		Iterator<Map.Entry<Integer, String>> iterator = fruitmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("key = " +entry.getKey());
			System.out.println("Key Value = " +entry.getValue());
		}
		
	}

	private static void keySetIteration(Map<Integer, String> fruitmap) {
		for (Integer fruitId : fruitmap.keySet()) {
			System.out.println("Key Value : " + fruitId);
			System.out.println("Value : "+ fruitmap.get(fruitId));
		}
		
	}
}
