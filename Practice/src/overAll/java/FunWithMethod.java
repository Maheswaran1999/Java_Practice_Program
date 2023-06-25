package overAll.java;

public class FunWithMethod {

	public static void main(String[] args) {
		System.out.println("First Main method");
		FunWithMethod obj = new FunWithMethod();
		obj.main("Dhoni", "kohli");

	}

	public static void main(String string, String string2) {
		System.out.println("Second  Main method");
		String result = string + string2;
		System.out.println(result);
	}

}