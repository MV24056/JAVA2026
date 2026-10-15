package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak2 {

	//da li je data rijec palindrom
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("unesienicu");
		
		String recenica = sc.nextLine().trim();
		StringBuilder sb= new StringBuilder(recenica);
		String obrnuto = sb.reverse().toString();
		
		if(recenica.equalsIgnoreCase(obrnuto)) {
			System.err.println("jeste palindrom");
			
		}else {
			System.out.println("nije palindrom");
		}
sc.close();
	}

}
