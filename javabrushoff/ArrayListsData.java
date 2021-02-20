package javabrushoff;
import java.util.*;

public class ArrayListsData {
	
	public static void main(String[]args) {
		
		ArrayList<String> al1 = new ArrayList<String>(20); // Create an array list with 20 values
		// To add values 
		al1.add("Ricky");
		al1.add("Mickey"); 
		
		// We can create an arraylist and feed it with integers ( Created on the fly
		ArrayList <Integer> al2 = new ArrayList<Integer>(Arrays.asList(1,3,3,4,5,5,6));
		for(int x: al2) System.out.println(x);
		
		// We can get values from the arraylist by index
		System.out.println(al2.get(0));
		// We can insert a value in the arraylist
		al2.set(0, 38); // We have inserted 38 at index 0
		
		// We can remove elements from the arraylist
		al2.remove(4); // Basically we remove by index
		
		
	}

}
