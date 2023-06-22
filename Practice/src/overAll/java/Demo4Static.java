package overAll.java;

public class Demo4Static {

	{
		System.out.println("Instance-block");
		{
			System.out.println("nested instance block");
		}
	}

	static {
		System.out.println("static block");
	}

	static String name = "Mahes";
	String college = "Dhonoi";

	public static void m1() {
		System.out.println("static-method");
		name = "Sachin";
		System.out.println(name);
	}

	public static void main(String[] args) {

		Demo4Static demo4Static = new Demo4Static();
		System.out.println(demo4Static.college);
		Demo4Static.m1();

	}

}
