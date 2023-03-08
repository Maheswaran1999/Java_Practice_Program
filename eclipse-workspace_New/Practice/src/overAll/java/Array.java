package overAll.java;

public class Array {

	public static void main(String[] args) {
		int a[] = new int[10];
		int[] b = { 10, 20, 30 };
		int x=(b[0]>b[1])?b[0]:b[1];
		System.out.println("The biggest element between zero and first position is"+x);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
