package overAll.java.polymorphism;

public class ChildClass extends DemoMethodOverRiding {

	public static String m2(String args) {
		return args;
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		System.out.println(childClass.m1("dhoni"));
		System.out.println(childClass.m2("Kholi"));
		// childClass.m1("mahes");
		// childClass.m2("sachin");
		// System.out.println(ChildClass.m1("dhoni"));
		// System.out.println(ChildClass.m1("Kholi"));
		// ChildClass.m1("dhoni");
	}
}
