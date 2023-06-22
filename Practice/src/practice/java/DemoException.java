package practice.java;

import java.io.IOException;

public class DemoException {
	
	protected int division(int a, int b) throws ArithmeticException,IOException {
		return a / b;
	}
	

	private void throwExcep(int age) {
		if (age < 18) {
			throw new ArithmeticException("The Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] java) {
		DemoException exception = new DemoException();
		//exception.division(100, 0);
		exception.throwExcep(89);

	}
}
