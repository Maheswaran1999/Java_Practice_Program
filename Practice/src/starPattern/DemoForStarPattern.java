package starPattern;

import java.util.*;

public class DemoForStarPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = input.nextInt();
		System.out.println("Enter the column");
		int colums = input.nextInt();

		int i, j;
		for (i = 1; i <= rows; i++) {
			for (j = 1; j < colums; j++) {
				if (i == 1 && (j == 1 || j == 3 || j == 5 || j == 7 || j == 9)) {
					System.out.print("*");
				} else if (i == 2 && (j == 1 || j == 3 || j == 5 || j == 7)) {
					System.out.print("*");
				} else if (i == 3 && (j == 1 || j == 3 || j == 5)) {
					System.out.print("*");
				} else if (i == 4 && (j == 1 || j == 3)) {
					System.out.print("*");
				} else if (i == 5 && (j == 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
