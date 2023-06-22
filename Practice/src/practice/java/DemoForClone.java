package practice.java;

public class DemoForClone {
	int jersyNumber;
	String name;

	DemoForClone(int jersyNumber, String name) {
		this.jersyNumber = jersyNumber;
		this.name = name;
	}

	public void m1() {
		System.out.println("Method 1");
	}

	public static void main(String[] args) {
		DemoForClone clone = new DemoForClone(10,"sachin");

	}

}
