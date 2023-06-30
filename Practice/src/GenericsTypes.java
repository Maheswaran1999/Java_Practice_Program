
public class GenericsTypes<T> {

	T a;

	public GenericsTypes(T number) {
		this.a = number;
	}

	public void print() {
		System.out.println(a);
	}

	public static <T> void cut(T value) {
		System.out.println("cut method :" + value);
	}

	public Object m1(T value1) {

		return value1;
	}

	public static void main(String[] args) {
		GenericsTypes obj = new GenericsTypes<>(23);
		obj.print();
		obj.cut("Java");
		obj.cut(100);
		obj.m1(10);
		System.out.println(obj.m1("Sachin"));

	}
}
