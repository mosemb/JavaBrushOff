package javabrushoff;
import java.util.*;

public class RecursionMeth {
	
	public static void main(String []args) {
		System.out.println(recursion(4));
		int [] vals = {6,9,9,0,2,3,91,1};
		System.out.println(getArray(vals));
		
	}
	
	public static int recursion(int num) {
		
		if(num ==1|| num<1) {
			return 1;
		}else {
			int result = num * recursion(num-1);
			return result;
		}
		
	}
  public static int getArray(int []arr) {
	  int sum = 0; 
	  for(int x : arr) {
		  sum = sum+x;  
	  }
	  
	  return sum;
	  
  }

}
