package starPattern;

import java.util.Scanner;

public class PyramidStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the row");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
System.out.println();
		}

	}
}