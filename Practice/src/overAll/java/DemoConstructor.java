package overAll.java;

final class DemoConstructor {

	private DemoConstructor() {

	}

	int getM1(int a) {
		return a;
	}

	public static DemoConstructor getInstance() {
		return DEMO_CONSTRUCTOR;
	}

	static DemoConstructor DEMO_CONSTRUCTOR = new DemoConstructor();
}
