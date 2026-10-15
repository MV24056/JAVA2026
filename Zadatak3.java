package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Unesi riječ: ");
	        String rijec = sc.nextLine().toLowerCase();
	        
	        String samoglasnici = "aeiouAEIOU" ;
	        
	        int samoglasnikbr = 0;
	        int suglasnik = 0;
	        

	        for (int i = 0; i < rijec.length(); i++) {
	            char c = rijec.charAt(i);
	            if(Character.isLetter(c)) {
	            	if(samoglasnici.indexOf(c)!=-1) {
	            		samoglasnikbr=samoglasnikbr+1;
	            		
	            	}else {
	            		suglasnik=suglasnik+1;
	            	}
	            }
	                
}

	        System.out.println("ukupan broj samoglasnika je:"+samoglasnikbr);
	        System.out.println("ukupan broj suglasnika je"+suglasnik);
	        sc.close();
	}
}