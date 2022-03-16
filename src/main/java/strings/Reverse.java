//3) Java Program to Reverse a String without using Reverse function
package strings;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello world";
		String revString = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revString += str.charAt(i);
		}

		System.out.println(revString);
	}
}