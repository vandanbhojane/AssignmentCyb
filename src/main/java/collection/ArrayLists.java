//1) Create an Arraylist and add/remove specific element from it (input given by user). Display the Arraylist after modification.
package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
			list.add("Ravi");//Adding object in arraylist  
			list.add("Vijay");  
			list.add("Ravi");  
			list.add("Ajay");  
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  


	}
	}
}
