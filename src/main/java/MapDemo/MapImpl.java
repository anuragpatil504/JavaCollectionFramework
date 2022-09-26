/*
 Map is not [part of collection cause collection is used to store only values whereas map stores
 key value pair
 Operations are put
 
 Treemap is used to print in sorted manner	of keys
 */


package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {

	public static void main(String[] args) {
		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(1, "A");
		myMap.put(2, "B");
		myMap.put(3, "C");
		System.out.println(myMap);
		myMap.remove(2); 
		//To iterate
		for(Map.Entry<Integer,String> e : myMap.entrySet() ) {
			System.out.println(e);
		}

		
		//To return keyset
		
		for(Integer key : myMap.keySet()) {
			System.out.println(key);
		}
		
	}

}
