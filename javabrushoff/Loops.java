package javabrushoff;

public class Loops {
	
	public static void main(String []args) {
		for(int i = 0; i<10; i++) {
			System.out.println("Value of i is i :"+i);
		}
		
		int wl = 0; 
		while(wl<20) {
			
			if(wl%2==0) {
				System.out.println("Value of wl :"+wl);
				wl++;
				continue;
				
			}
			
			if(wl>=10) {
				break;
			}
			
			wl++;
			
		}
	}
	

}
