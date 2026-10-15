package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	//provjerati koja su to slova sto se na stringu ponavljaju
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Unesi riječ: ");
	        String rijec = sc.nextLine().toLowerCase();
	        

	        System.out.print("Slova koja se ponavljaju su: "); 
	        
	        for (int i = 0; i < rijec.length(); i++) {
	            char slovo = rijec.charAt(i);

	            if (rijec.indexOf(slovo) != rijec.lastIndexOf(slovo)) {
	            	 System.out.print(slovo + " ");
	            }
	        }

	        
	        //for(int i =0 ; i<test.length()-1;i++){
	        //char c
	        sc.close();
	    }
	}
	        
