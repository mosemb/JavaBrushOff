package javabrushoff;

import java.util.*;

public class Conditionals {
	
	public static void main(String[]args) {
		
		int age = 12; 
		if((age>=12)&&(age<=6)) {
			System.out.println("Go to kindergarten");
		}else if ((age>=7)&& (age<=13)) {
			System.out.println("Go to middle School");
			
		}else if ((age>=14)&& (age<=18)) {
			System.out.println("Go to highschool");
		}
		
		System.out.println("True or False :"+(true||false));
		System.out.println("!True :"+!true);
		
		boolean canVote = age>=18 ? true:false; // Ternary Operator
		System.out.println("The age is the legal voting age : "+canVote);
		
		// Switch operator 
		String lang = "France";
		switch(lang) {
		case "Chile": case"Argentina":
			System.out.println("Hola");
			break;
		case "Italy":
			System.out.println("Ciao");
			break;
			
		case "France":
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("Hello");
		}
		
		
	}

}
