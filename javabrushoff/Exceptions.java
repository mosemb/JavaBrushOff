package javabrushoff;
import java.util.*;

public class Exceptions {
	
	public static void main (String[]args) {
		
		try {
			int badInt = 10/0;
		}
		  catch(ArithmeticException ex) {
			  System.out.println("Cant devide by zero");
			  System.out.println(ex.getMessage());
			  System.out.println(ex.toString());
			  
		  } catch(Exception ex) {
			  
			  System.out.println(ex.getMessage());
		  }
		    finally {
		    	System.out.println("Clean up");
		    }
		
		
	}
	
	

}
