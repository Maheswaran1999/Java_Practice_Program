
public class MainInterfaceDemo implements DemoInterface {
	public void add() {
		System.out.println("m1-Method");
	}
	static void m2() {
		System.out.println("m2 Method");
	}
	
	public static void main(String[] args) {
		MainInterfaceDemo obj =new MainInterfaceDemo();
		obj.add();
		
	}

}
