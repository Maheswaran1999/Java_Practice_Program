package streamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class BasicMap {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("sachin", "rohit", "dhoni");

		String upperCase = str.toString().toUpperCase();
		System.out.println(upperCase);

		str.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
	}

}
