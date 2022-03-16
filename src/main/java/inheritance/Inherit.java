//Write a class that inherits the other class. Pass the values to Super class members and print them
package inheritance;

class one {
	public void print_Abc() {
		System.out.println("Abc");
	}
}

class two extends one {
	public void print_Def() {
		System.out.println("Def");
	}
}

// Driver class
public class Inherit {
	public static void main(String[] args) {
		two g = new two();
		g.print_Abc();
		g.print_Def();
		g.print_Abc();
	}
}
