package Abstract.Interface;

public class AbstractFinal extends AbstractDemo {

	public void m1() {
		System.out.println(" abstract void-method");
	}

	public int m2(int a) {
		return a;
	}

	public static void main(String[] args) {
		AbstractFinal abstractFinal = new AbstractFinal();
		abstractFinal.m1();
		System.out.println(abstractFinal.a);
	}

}
