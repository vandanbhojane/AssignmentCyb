//1) Write a program to print n number of elements using loop (where n is read from user).If number is even then print "Even"
package Loops;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = s.nextInt();
	        if(n % 2 == 0)
	        {
	            System.out.println("The given number "+n+" is Even ");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is Odd ");
		}
	        s.close();
	        
	}
}
