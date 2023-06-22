package Abstract.Interface;

class Result implements demo {
	public void demo1() {
		System.out.println("Hiiiiii");
	}

	public int m1(int a) {
		return a;
	}

	private void absr() {
		System.out.println("absr method");

	}

	public static void main(String[] args) {
		System.out.println("Hi");
		Result result = new Result();
		result.demo1();
		result.absr();
		System.out.println(result.m1(10));
		System.out.println(demo.m2(0));
	}
}