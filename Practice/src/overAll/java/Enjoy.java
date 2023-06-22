package overAll.java;

public class Enjoy extends Fun{

	public static void main(String[] args) {
		Enjoy enjoy=new Enjoy();
		enjoy.m1();
		enjoy.m2();

	}

	@Override
	public void m1() {
		System.out.println("m1 Method");
		
	}

	@Override
	void m2() {
		System.out.println("m2 Method");
		
	}

}
