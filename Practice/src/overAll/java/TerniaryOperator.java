package overAll.java;

public class TerniaryOperator {
	public static void main(String[] args) {
		int x = 35;
		int y = 15;
		int z = 45;
		int largestNumber = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		
		System.out.println(largestNumber);
	}
}
