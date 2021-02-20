package javabrushoff;

import java.util.*;

public class IteratorsData {
	
	public static void main(String []args) {
		
	ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,6,89,9,0,4,3,4,32,3));
	for(int x:arr) System.out.println("Array values :"+x);
	
	// The Iterator goes through all the values in the arraylist one by one
	Iterator it = arr.iterator(); 
	
	while(it.hasNext()) {
		
		System.out.println("Iterator :"+it.next());
	}
		
	}

}
