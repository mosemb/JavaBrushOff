package javabrushoff;
import java.util.*;


public class Helloworld {
	
	static Scanner sc = new Scanner(System.in); 
	final double SHORTPI = 3.148798;
	
	public static void main(String[]args) {
		
	System.out.println("Hello World!");
	// Data types min and max values 
	// The data types are byte, short, char, long, double, float, boolean string
	System.out.println("Byte max value :"+Byte.MAX_VALUE);
	System.out.println("Byte min value :"+Byte.MIN_VALUE);
	System.out.println("Short max value : "+Short.MAX_VALUE);
	System.out.println("Short min value :"+Short.MIN_VALUE);
	//The process continues for other data types. 
	// The data types can be shown below. 
	int number_1 = 6 ; 
	short number_2 = 9;
	char text = 'a';
	String me = "Moses";
	double decimal_nos = 20/5.0;
	boolean girl = true;
	long long_no = 10000000; 
	
	// Casting 
	double xt = 6.998;
	int xtInt = (int) xt; // Converted the double to an Int. 
	
	// Convert to String 
	String conv =Double.toString(xt);
	
	// Convert to Integer 
	int val = Integer.parseInt("899");
	
	System.out.println("Integer from str :"+val);
	System.out.println(me+conv);
	System.out.println(xtInt);
	System.out.println(long_no);
	System.out.println(number_2);
	
	
	// Math functions 
	int inkme = 0;
	//stem.out.println(inkme++); // Increment operators 
	System.out.println(inkme++);
	System.out.println(++inkme);
	
	//Shortcuts 
	inkme  +=10; // Same as inkme = inkme+10;
	
	}

}
