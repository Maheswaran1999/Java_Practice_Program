package practice.java;

public class GarbageCollector {
	
	public void finalize() {
		System.out.println("Run the finalize method");
	}

	public static void main(String[] args) {
		GarbageCollector collector = new GarbageCollector();
		
		collector = null;

		try {
			int a = 100 / 0;
		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}
		System.gc();
		Runtime cc=Runtime.getRuntime();

	}

}
