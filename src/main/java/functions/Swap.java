//1) Write a function to swap values of two variables without using third variable.

package functions;

public class Swap {

	public static void main(String[] args) {
	    {
	        int x = 10;
	        int y = 5;
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        System.out.println("After swapping:" + " x = " + x + ", y = " + y);
	    }
	}
}


