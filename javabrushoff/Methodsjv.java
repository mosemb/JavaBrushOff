package javabrushoff;
import java.util.*;

public class Methodsjv {
	
	public static void main(String []args) {
		System.out.println("Sum of values is "+getsum(5,7));
		sumnos(1,2,3,4,4,5,5,6,7,8,8);
		
		int vals []= getNos(6);
		for(int x: vals) System.out.println("The Array values are :"+x);
		
		List<Object> rand = getRandList();
		System.out.println(rand);
		

		
		
	}
	
	public static int getsum(int x, int y) {
		return x+y;
	}
	
	public static int sumnos(int ...num) { // The ... means take in lots of of ints no 
		                                   // Limit on the values. By default its an array
		int sum = 0; 
		for(int x: num) {
			sum = sum + x;
			//System.out.println("The value sum for Array is:"+sum);
		}
		System.out.println("The value sum for Array is:"+sum);
		return sum;
	}
	
// Method that returns mutlitiple values from a method. 
	public static int [] getNos(int x) {
		int [] vals = new int[2];
		vals[0] = x+1;
		vals[1] = x+2;
		
		return vals;
		
	}
	
	public static List<Object> getRandList(){ // We are creating a random list with ints and Strs
		String name = "Moses"; 
		int age = 21; 
		return Arrays.asList(name,age);
		
	}
	
	

}
