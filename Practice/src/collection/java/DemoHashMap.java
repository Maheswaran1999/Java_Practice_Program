package collection.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(1, "One");
		obj.put(2, "Two");
		
		
		for(Integer key:obj.keySet()) {
			System.out.println(key);
		}

		for (Map.Entry m : obj.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
