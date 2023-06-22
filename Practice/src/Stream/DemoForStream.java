package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoForStream {

	public static void main(String[] args) {
		List<Integer> var = Arrays.asList(10, 20, 30, 40, 50);

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Sachin");
		hashMap.put(18, "virat");
		hashMap.put(45, "Rohit");
		hashMap.put(100, "Tendulkar");

		System.out.println("******************HASHMAP*******************");
		for (String value : hashMap.values()) {
			System.out.println("The value is:" + value);
		}
		for (Integer key : hashMap.keySet()) {
			System.out.println("The key is:" + key);
		}

		List<Integer> result = var.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(result);

		int finalResult = result.stream().reduce(0, (a, b) -> a + b);
		System.out.println("sum Result:" + finalResult);
	}
}
