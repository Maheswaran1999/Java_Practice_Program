import java.util.*;

public class NonRepeatedLetters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		Map<Character, Integer> charCount = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (charCount.containsKey(c)) {
				int count = charCount.get(c);
				charCount.put(c, count + 1);
			} else {
				charCount.put(c, 1);
			}
		}

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (charCount.get(c) == 1) {
				System.out.print(c + " ");
			}
		}
	}
}
