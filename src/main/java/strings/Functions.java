//2) Write a program which includes different operations/functions on String
package strings;

public class Functions {

	public static void main(String[] args) {
	    //Length
		String s1="hello"; 
		String s2="whatsup"; 
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length()); 

		//Compareto
		String s3="hemlo"; 
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		
		//Concat
		s1=s1.concat("how are you");
		System.out.println(s1);
		
	}

}
