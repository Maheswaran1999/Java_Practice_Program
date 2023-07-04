package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAdvancedStream {

	public static void main(String[] args) {

		// I want to print the value (without "null" element)
		List<Integer> value = Arrays.asList(10, 20, 30, null, 40, 50, null, 60, 70, null);

		// without Stream
		System.out.println("============without Stream============");
		for (Integer integer : value) {
			if (integer == null) {
				continue;
			} else {
				System.out.println(integer);
			}
		}

		// with Stream
		System.out.println("============with Stream============");
		value.stream().filter(v -> v != null).forEach(v -> System.out.println(v));

	}

}
