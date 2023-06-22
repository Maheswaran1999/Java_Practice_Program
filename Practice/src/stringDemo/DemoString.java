package stringDemo;

import java.util.Arrays;

public class DemoString {

	public static void main(String[] args) {
		String s = 10 + 10 + "Sachin" + 10 + 10;
		System.out.println(s);
		String s1 = "Sachin";
		String s2 = "Rohit";

		System.out.println("Equals Operator");
		System.out.println(s1 == s2);
		System.out.println("Equals Method");
		System.out.println(s1.equals(s2));
		System.out.println("Concat Method");
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println("SubString");
		String ch = s1.substring(0, 3);
		System.out.println(ch);

		System.out.println("||******Diff b/w eqauls() vs == operator******||");
		String ss = "Sachin";
		String ss1 = "Sachin";
		String ss2 = new String("Sachin");
		System.out.println(ss == ss2); // true

		System.out.println("ss.equals(ss1)" + ss.equals(ss1)); // true

		System.out.println("ss == ss2" + ss == ss2); // false
		System.out.println("ss.equals(ss2)" + ss.equals(ss2)); // true

		System.out.println("||******StringBuffer Class******||");
		StringBuffer buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		buffer.reverse();
		System.out.println(buffer);

		// ======================================================================================
		int a[] = new int[6];

		int[] c = { 1, 12, 23, 45, 67 };
		System.out.println(c[1]);

		a[0] = 12;
		a[1] = 12;
		a[2] = 13;
		a[3] = 34;
		a[4] = 45;
		a[5] = 24;
		System.out.println(a[5]);

		// ======================================================================================
		// split the word in sentence:
		String str = "my name is maheswaran";
		String[] split = str.split("\\s");
		System.out.println(split.length);
		for (String word : split) {
			System.out.println(word);
		}
		// ======================================================================================
		// find the character count
		String findChar = "This is my laptop";
		int count = 0;
		for (int i = 0; i < findChar.length(); i++) {
			if (findChar.charAt(i) == 'l') { // if (findChar.charAt(i) != ' ') "character count"
				count++;
			}
		}
		System.out.println("Number of char available " + count);

		// ======================================================================================
		// remove extra white spaces

		String removeSpaces = "I   love    pdf";

		String findRemovespace = removeSpaces.replaceAll("\\s+", " ");
		System.out.println(findRemovespace);

		int count1 = 0;
		for (int i = 0; i < removeSpaces.length(); i++) {
			if (removeSpaces.charAt(i) != ' ') {
				count1++;
			}
		}
		System.out.println(count1);

		// ==============================================================================================
		String strr = "   Hello,    world!    ";
		String result = "";

		for (int i = 0; i < strr.length(); i++) {
			char currentChar = strr.charAt(i);
			if (currentChar != ' ') {
				result += currentChar;
			}
		}
		System.out.println(result);
		// ==============================================================================================
		long startTime = System.currentTimeMillis();
		int count2 = 0;
		StringBuffer strBuf = new StringBuffer("Hey Maheswaran,You can do it");
		for (int i = 0; i < strBuf.length(); i++) {
			if (strBuf.charAt(i) == 'a')
				count2++;
		}
		System.out.println("The number of a-char present in the sentence " + count2);
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Time is" + totalTime);
	}
}
