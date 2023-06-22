package practice.java;

class CustomExcep extends Exception {
	int a=100;
	public CustomExcep(String s) {
		System.out.println(s);
	}
}

public class CustomException {
	public static void main(String[] args) throws CustomExcep {
		try {
			int i =100/0;
		} catch (Exception e) {
			 new CustomExcep("Must sent a above 0+ value");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("After finally block");
	}
}