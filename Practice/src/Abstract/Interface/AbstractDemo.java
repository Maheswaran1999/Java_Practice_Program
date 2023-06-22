package Abstract.Interface;

abstract class AbstractDemo {
	
	public AbstractDemo() {
		System.out.println("constractor");
	}

	 int a = 10;

	abstract void m1();
	
	public static int m2(int b) {         // static method
		return 100;
	}

}
