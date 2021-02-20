package javabrushoff;
import java.util.*;

public class UserInput {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		
		System.out.println("Enter your name :");
		if(sc.hasNextLine()) {
			
			String username = sc.nextLine();
			System.out.println("Hi :"+username);
			
		}
		
	}

}
