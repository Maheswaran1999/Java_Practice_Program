package Abstract.Interface;

public class MainDemo extends DemoInterface {
		public  void add() {
			
		}
			public void m1() {
				System.out.println("hey");
			}
		
	
	void sub() {
		
	}

	public static void main(String[] args) {
		MainDemo obj=new MainDemo();
		obj.m1();

	}
	public static void m2(DemoInterface demo) {
		demo.m1();
	}

}
