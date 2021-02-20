package javabrushoff;
import java.util.*;


public class ArraysDatas {
	
	public static void main( String []args) {
		
		// Java arrays do not mix Ints are alone and Strings etc are alone. 
		
		int[] a1= new int[10];
		a1[0]=1;
		Arrays.fill(a1, 3);
		
		String [] str1 = {"The", "Boy", "Is", "Mine"};
		String [][] str2 = {{"00", "01"}, {"10", "11"}}; // Two dimensional array
		//String [][][] str3 = {{{"1", ""}, {"45", "3"}}, {}};
		
		//System.out.println(str1[0]); 
		//System.out.println(str2[1][1]);
		

		for(int x:a1) System.out.println(x);
		//System.out.println(a1.length);
		
		// Integer arrays 
		int [] arr1 = {1, 3, 4,5}; 
		int [] arr2 = Arrays.copyOf(arr1,7);
		
		for (int x : arr2) System.out.println("Array Copy :"+x);
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		int [] arr3 = {10, 57, 7, 34, 12, 9, 5, 2, 2};
		Arrays.sort(arr3);
		System.out.println(arr3[0]);
		
		// We can convert the arrays to strings as well 
		System.out.println(Arrays.toString(arr3)); // This will print the whole array. 
	
		
	}

}
