package DrugaNedeljaVjezbe;

import java.util.Scanner;

public class CetrnaestiZadatak {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 System.out.println("unesite x");
		        int x = sc.nextInt();
		 System.out.println("unesite y");
		        int n = sc.nextInt();

		        int stepen = 1;

		        for (int i = 1; i <= n; i++) {
		            stepen = stepen * x;
		        }

		        System.out.println("stepen nivoa:" + n + "broja x je:" +stepen);
		        
		        
		    }
		
}
