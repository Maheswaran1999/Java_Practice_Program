package stringDemo;

import java.util.Arrays;

public class CountChar {

	public static void main(String[] args) {
		String str = "Maheswaran";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("'a'count: " + count);
		
		//========================================

		String countWords = "Maheswaran Maheswaran";
		String[] split = countWords.split("//s");
		System.out.println("How many words available:" + split.length);
		
		//=============sort the array=========================

		String name = "abcdefgh";
		String myname = "hgfedcba";
		char[] correctWord = myname.toCharArray();
		Arrays.sort(correctWord);

		String string = new String(correctWord);
		System.out.println("Orginal word: " + name);
		System.out.println("Corrected word: " + string);

		if (string.equals(name)) {
			System.out.println("Everything fine as expected");
		} else {
			System.out.println("The expectation and acutal differ");
		}
	}
}