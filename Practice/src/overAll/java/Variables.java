package overAll.java;

import java.util.Arrays;
import java.util.stream.Stream;

class Variables {
	int z = 10;// Instance variables

	static int c = 15;// static variables

	public int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	static void main(String[] args) {
		Variables obj = new Variables();
		System.out.println(obj.max(10, 20));

	}
}
