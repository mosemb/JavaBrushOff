package javabrushoff;
import java.util.*;

public class LinkedLists {
	
	public static void main(String []args) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		//Lets add some values individually 
		arr.add(78);
		arr.add(90);
		arr.add(100); 
		// Now lets add some values as a list 
		arr.addAll(Arrays.asList(1,3,4,5,5,6,6,7,7));
		// We can add an element at the front 
		arr.addFirst(603);
		//We can add an element at the back 
		arr.addLast(90);
		arr.set(5, 34);
		
		for(int x: arr) System.out.println("Linked List "+x);
		// We can use an iterator 
		Iterator it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println("Iterator :"+it.next());
		}
		// We can get the size 
		arr.size();
		
		//We can remove items from the array
		arr.remove(4); //In this case we are removing item at index 4. 
		
		//The list can be converted into an array
		Object [] arry = arr.toArray();
		for(int x: arr) System.out.println("List to Array "+x);
		
	}

}
