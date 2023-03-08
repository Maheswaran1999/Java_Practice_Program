package overAll.java;

public class TerniaryOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println(largestNumber);
	}
}
