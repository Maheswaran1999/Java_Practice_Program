package polymorphism;

public class MainClass extends ParentClass {

	public int add(int c, int d) {
		System.out.println("C and D class");
		return c + d;
	}

	public static void main(String[] args) {
		MainClass obj1 = new MainClass();
		ParentClass obj2 = new ParentClass();
		System.out.println(obj1.add(10, 20));
		System.out.println(obj1.add(20, 20));

	}

}
