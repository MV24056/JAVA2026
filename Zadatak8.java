package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
	        String s = sc.next(); 
	        int pozicija = sc.nextInt();
	        
	        if (pozicija < 0 || pozicija >= s.length()) { 
	            System.out.println("ovdje  pozicija"); 
	        } 
	     
	        boolean slobodno = (pozicija > 0 && s.charAt(pozicija - 1) == '0') || (pozicija < s.length() - 1 && s.charAt(pozicija + 1) == '0'); 
	        
	        if (slobodno) {
	            System.out.println(1);
	        } else {
	            System.out.println(0);
	        }
	        sc.close();
	   }

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
