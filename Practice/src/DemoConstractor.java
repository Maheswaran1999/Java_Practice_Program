
public class DemoConstractor {

	int s, z;

	private DemoConstractor(int a, int b) {
		s = a;
		z = b;
		System.out.println(s + z);
	}

	public DemoConstractor() {
		System.out.println("default constractor");
	}

	public static void main(String[] args) {
		DemoConstractor ParaObj = new DemoConstractor(10, 20);
		DemoConstractor defaObj = new DemoConstractor();

	}
	
	
	
	

}
