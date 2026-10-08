package CetvrtaNedeljaVjezbe;

import java.util.Random;
import java.util.Scanner;

public class UnosNiza {

	public static void main(String[] args) {

	  		Scanner sc = new Scanner (System.in);

	  		System.out.println("Unesite broj clanova niza");
	  		int nduzinaniza = sc.nextInt();    //unosimo duzinu niza 
	  		
	  		double niz[]= new double [nduzinaniza];
	  		
	      Random random = new Random ();
	      for (int i =0; i<nduzinaniza ; i++) {
		  niz [i] = random.nextInt(10)+1;
		  
	      }
	  
	  		for(int i = 0;i<nduzinaniza;i++) {  //stampamo niz tako sto polazimo kroz for
	  			System.out.println(niz[i]+" ");
	  		}
	  		System.out.println();
	  		
	  		
	  		for(int i = 0;i<nduzinaniza;i++) {
	  			if(niz[i]%2 == 0) {
	  				niz[i] = -1*niz[i];
	  			}else {
	  				niz[i] = 1/niz[i];
	  			}
	  		}
	  		
	  		for(int i = 0;i<nduzinaniza;i++) {
	  			System.out.println(niz[i]+" ");
		  		
	  		}
	  		sc.close();

	  }
	}
	

