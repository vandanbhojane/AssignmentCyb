/*2) Using nested loop write program to print the format as:
1
12
123
1234
12345
*/


package Loops;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows");

		int rows = sc.nextInt();

		System.out.println("Here is Pattern");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
