package javabrushoff;
import java.util.*;
//import java.util.IntStream;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Moses"; 
		String sName = "Mb"; 
		String fullname = name + " "+sName;
		
		System.out.println(fullname); 
		System.out.println(sName.charAt(0));
		System.out.println(name.contains("es"));
		System.out.println(fullname.indexOf("b"));
		System.out.println(fullname.length());
		
		// Comparing equality of strings 
		System.out.println("dog".equals("dog")); 
		
		// Replace strings 
		System.out.println(fullname.replace("Mb", "Sekiziivu"));
		
		// Find a substring between these comments 
		System.out.println("Subsrting "+fullname.substring(0,5)); 
		for(String x: fullname.split(" ")) System.out.println("Split :"+x);
		
		// Sting buffers 
		//Stringbuilder sb = new StringBuffer("I am a string builder");
		
		

	}

}
