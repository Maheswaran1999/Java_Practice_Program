package overAll.java;

public class DemoFun {
	public int a = 10;
	protected int b=20;

	
public int m1(int a) {
	return a;
}
	
	
	
	public static void main(String[] args) {

		DemoFun demoFun = new DemoFun();
		System.out.println(demoFun.m1(10));
		System.out.println(demoFun.a);
		System.out.println(demoFun.b);

	}

}
