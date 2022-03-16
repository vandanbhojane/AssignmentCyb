//Write a program to handle below different types of exceptions (ArgumentException, ArgumentNullException, 
//ArgumentOutOfRangeException, ArithmeticException, ArrayTypeMismatchException, DivideByZeroException, IndexOutofRangeException,
//InvalidCastException, NullReferenceException, StackOverFlowException)
package exceptionHandling;

public class Exception {

	public static void main(String[] args) {
	    {
	        try {
	            int number[] = new int[10];
	            number[10] = 30 / 0;
	        }
	        catch (ArithmeticException e) {
	            System.out.println( "Zero cannot divide any number");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println( "Index out of size of the array");
	        }
	    }
	}}


