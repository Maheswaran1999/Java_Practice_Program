package practice.java;

class MahesException extends Exception {

	public MahesException(String string) {
		System.out.println(string);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		try {
			int age = 18 / 0;

		} catch (Exception e) {
			new MahesException("MahesException");
			System.out.println(e);
			System.out.println("Catch block");
		} 
		
		finally {
			System.out.println("Finally block");
		}
	}
}
