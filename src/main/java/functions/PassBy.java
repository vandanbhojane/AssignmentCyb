//3) Write Java Program to Demonstrate Pass by Value and Pass By Reference Parameter
//Pass by Value
package functions;

class PassBy {
	int data = 50;

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
	}

	public static void main(String args[]) {
		PassBy op = new PassBy();

		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);

	}
}


/* Pass by Reference
public class Example {


 
int a = 10;
void call(Example eg) {
    eg.a = eg.a+10;
}
 
public static void main(String[] args) {

    Example eg = new Example();
    System.out.println("Before call-by-reference: " + eg.a);
     
    // passing the object as a value using pass-by-reference
    eg.call(eg);
    System.out.println("After call-by-reference: " + eg.a);
     
     
}
}
*/