package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFilterStream {

	public static void main(String[] args) {
		List<Integer> listOfCaps = Arrays.asList(10, 11, 15, 40, 17, 60, 70);
		List<String> listOfCapsName = Arrays.asList("ola", "RedTaxi", "uber");
		List<Integer> evenNumberList = new ArrayList();

		for (Integer number : listOfCaps) {
			if (number % 2 == 0) {
				evenNumberList.add(number);
			}
		}

		List<Integer> number = listOfCaps.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumberList);
		System.out.println(number);

		listOfCapsName.stream().filter(str -> str.length() > 2 && str.length() < 4)
				.forEach(str -> System.out.println(str));
	}

}
