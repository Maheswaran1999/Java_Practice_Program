import java.util.ArrayList;

public class ArrayLists {

	public static void main(String args[]) {
		int arr[] = new int[4];
		arr[0] = 01;
		arr[1] = 02;
		arr[2] = 03;
		arr[3] = 04;
		// arr[4] = 15;
		// arr[5] = 16;
		// arr[6] = 17;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("***ArrayList***");

		ArrayList arrayList = new ArrayList();
		arrayList.add("String");
		arrayList.add(10);
		System.out.println(arrayList);
	}
}
