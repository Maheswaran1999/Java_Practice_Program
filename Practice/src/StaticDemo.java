
public class StaticDemo {

	int a = 10;
	static int c = 10;

	static {
		System.out.println("static block");
	}

	// we can't use the static variable within and without static method.

	public void m1() {
		System.out.println(StaticDemo.c);
		System.out.println("M1-Method");
	}

	public static void m2() {
		System.out.println(StaticDemo.c);

		System.out.println("static method");
	}

	public static void main(String[] args) {

		StaticDemo demo = new StaticDemo();
		demo.m1();
		System.out.println(demo.a);
		StaticDemo.m2();
		System.out.println(StaticDemo.c);

	}

}
